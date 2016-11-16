
package exercicioap1;

/*
 * @author Rodrigo
 */
//Programa possui a função de receber 5 numeros e devolver o maior deles

import java.util.Scanner;
public class ExercicioAP1 {

 
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int numero1,numero2,numero3,numero4,numero5, maior;
        
        do{
        System.out.println("Digite 5 numeros para receber o maior deles ");
        System.out.println("Caso queira encerrar o programa digite 0 as 5 vezes");
        
        numero1=numero.nextInt();
        numero2=numero.nextInt();
        numero3=numero.nextInt();
        numero4=numero.nextInt();
        numero5=numero.nextInt();
        
        if(numero1>numero2){
            maior=numero1;
        }
        else{maior=numero2;}
        
        if(maior<numero3){
            maior=numero3;
        }
        if(maior<numero4){
            maior=numero4;
        }
        if(maior<numero5){
            maior=numero5;
        }
        if(numero1==0 && numero2==0 && numero3==0 && numero4==0 && numero5==0){
            break;
        }
        System.out.println("o maior numero entre os digitados é: "+maior);
    }while(true);
    
}
}
