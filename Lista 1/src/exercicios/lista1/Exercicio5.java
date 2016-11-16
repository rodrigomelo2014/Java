
package exercicios.lista1;

/*
@author Rodrigo Melo

5. Faça um programa que recebe dois vetores, um vetor com elementos, v[ ], e um vetor com
índices, índices[ ], e devolve um novo vetor que contém somente os elementos de v[ ]
indicados pelo vetor de índices, índices[ ].
 */
public class Exercicio5 {
    
    //método que gera novo vetor usando um vetor de base e um vetor de indices
    public static int[] geradorDeVetor(int[]v, int[] indices){
        
        int[] novoVetor = new int[indices.length];
        int x=0;
        for(int i =0;i<v.length;i++){
            for(int j=0;j<indices.length; j++){
                if(indices[j]==i){
                    novoVetor[x]=v[i];
                    x++;
                }
            }
        }
        return novoVetor;
    }
    //método para impressão do novo vetor
    public static void imprimeVetor(int [] novoVetor){
        
            for(int i=0;i<novoVetor.length;i++){
                System.out.println(novoVetor[i]);
            }
    }
    
    public static void main(String [] args){
        
        int []v = {0,7,15,22,14,8,5};
        int []indices= {0,2,3,6};
        int []novoVetor = geradorDeVetor(v,indices);
        imprimeVetor(novoVetor);
    
    }
    
}
