
package exercicios.lista1;

/*
@author Rodrigo Melo

2. Escreva um programa em Java que exiba os números primos de 2 à 100. Lembre-se que um
número é chamado de primo se é divisível somente por 1 e por ele mesmo.
*/

public class Exercicio2 {
    public static void main(String [] args){
        for(int i=2; i<100; i++){
            if(i==2 || i==3 || i==5 || i==7){
                System.out.println(i);
            }
            else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
                System.out.println(i);
            }
        }
    }
    
}
