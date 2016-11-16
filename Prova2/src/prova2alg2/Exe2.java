
package prova2alg2;
import java.util.Scanner;

/*
 * @author Rodrigo da Silva Melo
 */
public class Exe2 {
    
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.nextLine();
        char [] arrayFrase = frase.toCharArray();
        Pilha pilha = new Pilha();
        System.out.println("Frase corrigida: ");
        
        for(int i=arrayFrase.length-1; i>0; i--){
            if(arrayFrase[i]=='.')continue;
            pilha.push(arrayFrase[i]);
            if(pilha.top()==' '){
                for(int j=0;!pilha.isEmpty();j++)System.out.print(pilha.pop());
            }
        }
        System.out.println();
    }
}
    

