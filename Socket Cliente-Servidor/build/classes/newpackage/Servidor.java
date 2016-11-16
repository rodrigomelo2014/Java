package newpackage;

/*
 * @author Rodrigo da Silva Melo
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor {
    public static void main(String[] args) throws Exception{
        long lDateTime;
        System.out.println("Iniciando servidor.");
        //faz com que o servidor escute a porta 2525
        ServerSocket server = new ServerSocket(2525);
        
        System.out.println("Aguardando conexão.");
        //aceita a conexão com o cliente
        Socket socket = server.accept();
        
        System.out.println("Conexão estabelecida.");
        // Input/Output
        InputStream input = socket.getInputStream();
        OutputStream output = socket.getOutputStream();
        BufferedReader in = new BufferedReader(new InputStreamReader(input));
        PrintStream out = new PrintStream(output);
        
        //recebe a mensagem do cliente e manda a hora de volta.
        while(true){
            String mensagem = in.readLine();
            out.println(lDateTime = System.nanoTime());
            System.out.println(
            "Mensagem recebida do cliente ["
            + socket.getInetAddress().getHostName() +
            "]: " + mensagem);
                       
            if("FIM".equals(mensagem)) break;   
        }
        
        System.out.println("Encerrando conexão.");
        
        in.close();
        out.close();
        socket.close();
        System.out.println("Encerrando servidor.");
        server.close();
    }
}

            