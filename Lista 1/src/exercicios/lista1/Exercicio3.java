
package exercicios.lista1;
import java.util.Scanner;
/*
  @author Rodrigo Melo

3. Baseado no exercício de vetores visto em aula, construa um programa em Java que leia 4
notas e tire a média dessas notas. Caso a média seja igual ou maior que 6, imprima na tela a
mensagem de aprovado, caso contrário, reprovado. 
 */
public class Exercicio3 {
    
    //método que gera a lista com as notas
    public static float[] geradorLista(){
        Scanner numero = new Scanner(System.in);
        float[] listaNotas = new float[4];
        
        System.out.println("Digite as 4 notas: ");
        
        for(int i=0; i<4;i++){
        listaNotas[i]= numero.nextInt();
        }
        return listaNotas;
    }
    
    //método que indica se o aluno está aprovado ou reprovado
    public static void situacaoAluno(float[] listaNotas){ 
        
        if(((listaNotas[0]+listaNotas[1]+listaNotas[2]+listaNotas[3])/4)>=6){
        System.out.println("Aprovado!");
        }else{
        System.out.println("Reprovado!");
        }
    }
    
    
    public static void main(String [] args){
        
    float [] listaNotas=geradorLista();
    situacaoAluno(listaNotas);

    }
}
