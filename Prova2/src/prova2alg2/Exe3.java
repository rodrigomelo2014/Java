
package prova2alg2;

import java.util.Scanner;

/*
 * @author Rodrigo da Silva Melo
 */
public class Exe3 {
    public static void separador(Fila fila, Fila filaPares, Fila filaImpares){
        while(!fila.isEmpty()){
            if(fila.front()%2==0)filaPares.enqueue(fila.dequeue());
            else filaImpares.enqueue(fila.dequeue());
        }    
    }
    public static void imprimeFila(Fila fila){
        while(!fila.isEmpty()){
            System.out.println(fila.dequeue());
        }
    }
    
    public static void main(String [] args){
        Fila fila = new Fila();
        Fila filaPares = new Fila();
        Fila filaImpares = new Fila();
        Scanner leitor = new Scanner(System.in);
        int numero;
        System.out.println("Digite 10 numeros para separa-los entre pares e impares:");
        for(int i=0; i<10; i++){
            numero=leitor.nextInt();
            fila.enqueue(numero);
        }
        
        separador(fila,filaPares, filaImpares);
        System.out.println("PARES:");
        imprimeFila(filaPares);
        System.out.println("IMPARES:");
        imprimeFila(filaImpares);
        
    }
}
