
package prova1;
import java.util.Scanner;
/*
 * @author Rodrigo da Silva Melo
 */
public class Exe2 {
    
    /*Comparação, devolve a multiplicação do maior pela soma dos numeros intermediarios*/
    public static int multNum(int num1,int num2,int num3,int  num4){
        int maior = 0, intermediario1 = 0, intermediario2 = 0, menor = 0;
        
        if(num1>num2&&num1>num3&&num1>num4)
            maior=num1;
        else if(num1<num2&&num1<num3&&num1<num4)
            menor=num1;
        else
            intermediario1=num1;
        
        
        if(num2>num1&&num2>num3&&num2>num4)
            maior=num2;
        else if(num2<num1&&num2<num3&&num2<num4)
            menor=num2;
        else if(intermediario1!=num1)
            intermediario1=num2;
        else
            intermediario2=num2;
        
        if(num3>num1&&num3>num2&&num3>num4)
            maior=num3;
        else if(num3<num1&&num3<num2&&num3<num4)
            menor=num3;
        else if(intermediario1!=num1&&intermediario1!=num2)
            intermediario1=num3;
        else
            intermediario2=num3;
        
        if(num4>num1&&num4>num2&&num4>num1)
            maior=num4;
        else if(num4<num1&&num4<num2&&num4<num1)
            menor=num4;
        else if(intermediario1!=num1&&intermediario1!=num2&&intermediario1!=num3)
            intermediario1=num4;
        else
            intermediario2=num4;
        
        return(maior*(intermediario1+intermediario2));
        
    }
    public static void main(String [] args){
        int num1,num2,num3,num4;
        Scanner leitor= new Scanner(System.in);
        /*Parte do programa que recolhe os numeros do usuario*/
        System.out.println("Digite 4 numeros :");
        num1=leitor.nextInt();
        num2=leitor.nextInt();
        num3=leitor.nextInt();
        num4=leitor.nextInt();
        
        System.out.println("O resultado é: "+ multNum(num1,num2,num3,num4));
    }
}
