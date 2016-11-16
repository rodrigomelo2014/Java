
import java.util.Scanner;
/**
 *
 * @author Rodrigo
 */
public class TestaEntradaDeCinema {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a data, horario, sala e valor da entrada que você quer: ");
        System.out.printf("Coloque a data sem barras separando com espaços\nDigite apenas a hora sem os minutos\nColoque o numero da sala\nColoque o valor total do bilhete\n");
        int[]data=new int[3];
        data[0]=input.nextInt();
        data[1]=input.nextInt();
        data[2]=input.nextInt();
        int horario= input.nextInt();
        int sala=input.nextInt();
        float valor=input.nextFloat();
        
        
        EntradaDeCinema sessao1= new EntradaDeCinema(data,horario,sala,valor);
        System.out.println("Digite o ano do seu nascimento:");
        int nascimento=input.nextInt();
        sessao1.calcularDescontoIdade(nascimento);
        sessao1.calcularDescontoHorario(horario);
        System.out.println("Aqui está o seu ingresso:");
        sessao1.imprime();
    }
}
