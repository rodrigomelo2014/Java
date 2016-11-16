
package prova1;
import java.util.Scanner;
/*
 * @author Rodrigo da Silva Melo
 */
public class Exe1 {
    public static void main(String args []){
        int x;
        Scanner leitor =new Scanner(System.in);
        
        System.out.println("Digite um valor x para receber o resultado de f(x): ");
        x=leitor.nextInt();
        
      /*separação de função de acordo com o valor de x*/
        if(x <= -5){
            x=x-1;
            System.out.println("A função feita foi f(x)= x-1 , e o resultado é: "+x);
        }          
        else if(x > -5 && x <= 7){
            x= (x*x)-1;
            System.out.println("A função feita foi f(x)= x²-1, e o resultado é: "+x);
        }
        else if(x > 7 && x < 9){
            x=(1-x)*(2-(x*x));
            System.out.println("A função feita foi f(x)=(1-x)*(2-x²), e o resultado é: "+x);
        }
        else if(x >=9){
            x=x*((x-1)*(x-1)*(x-1));
            System.out.println("A função feita foi f(x)=x*(x-1)³, e o resultado é: "+x);
        }
        
        
    }
                    
}
    

