package prova2alg2;

import java.util.Scanner;

/*
 * @author Rodrigo da Silva Melo
 */
public class Exe1 {
    public static int tetranacci(int N){
        if(N==1 || N==2 || N==3)return 0;
        if(N==4)return 1;
        
        else return tetranacci(N-1)+tetranacci(N-2)+tetranacci(N-3)+tetranacci(N-4);
    }
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int N=leitor.nextInt();
        System.out.println("Numero de tetranacci: "+tetranacci(N));
        
    }
    
}
