
package exercicios.lista1;
import java.util.Scanner;

/*
@author Rodrigo Melo

4. Escreve um programa em Java que leia 10 números inteiros informados pelo usuário,
armazene esses números em um vetor de tamanho 10, ordene esses dados em ordem
crescente e depois imprima na tela todos esses dados ordenados
 */

public class Exercicio4 {
    
    //método para gerar a lista base
    public static int[]geradorLista(){
        Scanner numero = new Scanner(System.in);
        int[] listaNumeros = new int[10];
       
        
        System.out.println("Digite 10 numeros para ordená-los: ");
           
            for(int i=0;i<10;i++){
               listaNumeros[i]=numero.nextInt();
            }
        
        System.out.println();
            
    return listaNumeros;
    }
    
    //método para ordenar a lista
    public static int[] ordenarLista(int [] listaNumeros){
        int aux;
        
        for(int i=0;i<listaNumeros.length;i++){
       
            for(int j=0; j<listaNumeros.length;j++){
        
                if(listaNumeros[j]>listaNumeros[i]){
                    aux = listaNumeros[j];
                    listaNumeros[j]=listaNumeros[i];
                    listaNumeros[i]=aux;
                }
            }
        }
        return listaNumeros;
    }
    
    
    public static void main(String [] args){
       
        int[] listaNumeros = geradorLista();
        listaNumeros=ordenarLista(listaNumeros);
 
        for(int i=0;i<listaNumeros.length;i++){

            System.out.println(listaNumeros[i]);
        }
  
    }
}