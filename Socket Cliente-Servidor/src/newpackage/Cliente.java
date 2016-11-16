package newpackage;

/*
 * @author Rodrigo da Silva Melo
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception {
        long lDateTime;
        long FinalTime;
        long ServerTime;
        int tempo=0;
        int mensagens=0;
        
        System.out.println("Iniciando cliente.");
        System.out.println("iniciando conexão com o servidor.");
        
        Socket socket = new Socket ("JARVIS" ,2525);
        
        System.out.println("Conexão estabelecida.");
        // Input/Output
        InputStream input = socket.getInputStream();
        OutputStream output = socket.getOutputStream();
        BufferedReader in = new BufferedReader(new InputStreamReader(input));
        PrintStream out = new PrintStream(output);
       
        Scanner scanner = new Scanner(System.in);
        Scanner leitor = new Scanner(socket.getInputStream());

        
        while(true){
            System.out.print("Digite uma mensagem: ");
            //pega a mensagem e o momento em que ela entrou na conversa
            String mensagem = scanner.nextLine();
            lDateTime = System.nanoTime();
            //recebe a hora em que a mensagem chegou no servidor e a hora atual para ter o tamanho total da conversa
            out.println(mensagem);
            //Lê a mensagem e transforma de String para Long
            String mensagemServidor = in.readLine();
            FinalTime = System.nanoTime();
            ServerTime = Long.parseLong(mensagemServidor);  
            //System.out.println("A mensagem demorou "+(ServerTime-lDateTime)+" nanosegundos para chegar ao servidor.");
            //System.out.println("A conversa durou um total de, "+(FinalTime-lDateTime)+" nanosegundos.");
            if("FIM". equals(mensagem))break;    
            //aumenta o numero de mensagens
            mensagens++;
            //soma o tempo de conversa para gerar a média
            tempo+=FinalTime-lDateTime; 
        }
        //100.000 nanosegundos equivalem a 1 milisegundo
        System.out.println("Tempo médio: "+(tempo/mensagens)+" nanosegundos.");
        
        System.out.println("Encerrando conexão.");
        
        in.close();
        out.close();
        socket.close();
       
    }
    
}
