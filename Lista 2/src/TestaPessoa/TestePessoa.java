
package TestaPessoa;
import java.util.Scanner;
/*
 * @author Rodrigo da Silva Melo
 */
public class TestePessoa {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        String nome;
        int idade;
        float altura, peso;
                System.out.println("Digite seu nome: ");
                nome=leitor.nextLine();
                System.out.println("Digite sua idade: ");
                idade=leitor.nextInt();
                System.out.println("Digite seu peso: ");
                peso=leitor.nextFloat();
                System.out.println("Digite sua altura ");
                altura=leitor.nextFloat();
                System.out.printf("\n\n\n\n");
                
        Pessoa pessoa=new Pessoa(nome, idade, peso, altura);
        pessoa.mostraNome();
        pessoa.mostraIdade();
        System.out.println(pessoa.calculaIMC());
        pessoa.imprimeEstado(pessoa.calculaIMC());
        /*
        pessoa.mostraNome();
        pessoa.mostraIdade();
        pessoa.mostraPeso();
        pessoa.mostraAltura();
        pessoa.imprimeEstado(pessoa.calculaIMC());
        pessoa.alteraNome("Ricardo");
        pessoa.alteraAltura((float) 1.73);
        pessoa.alteraIdade(19);
        pessoa.alteraPeso(46);
        pessoa.mostraNome();
        pessoa.mostraIdade();
        pessoa.mostraPeso();
        pessoa.mostraAltura();
        pessoa.imprimeEstado(pessoa.calculaIMC());
        */
    }
    
}
