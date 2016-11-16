import java.util.Scanner;
/**
 *
 * @author Rodrigo da Silva Melo
 */
public class Exercicio1 {
    //métodos que descobrem o numero de par/impar presente na matriz
    public static int retornaTamanhoPar(int[][]matriz){
        int []vet=new int[2];
        int tamanhoPar=0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++)
                if(matriz[i][j]%2==0)tamanhoPar+=1;
        }
    return tamanhoPar;
    }
    public static int retornaTamanhoImpar(int[][]matriz){
        int []vet=new int[2];
        int tamanhoImpar=0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++)
                if(matriz[i][j]%2!=0)tamanhoImpar+=1;
        }
    return tamanhoImpar;
    }
    //métodos que retornam respectivamente um vetor par e outro impar
    public static int [] separaMatrizPar(int [][] matriz, int tamanho){
        int []par= new int[tamanho];
        int contVet=0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                if(matriz[i][j]%2==0){
                    par[contVet]=matriz[i][j];
                    contVet+=1;
                }
            }
        }
    return par;
    }
    public static int [] separaMatrizImpar(int [][] matriz, int tamanho){
        int []impar= new int[tamanho];
        int contVet=0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                if(matriz[i][j]%2!=0){
                    impar[contVet]=matriz[i][j];
                    contVet+=1;
                }
            }
        }
    return impar;
    }
    //método que imprime vetor
    public static void imprimeVetor(int [] novoVetor){
        
            for(int i=0;i<novoVetor.length;i++){
                System.out.println(novoVetor[i]);
            }
    }
    
    public static void main(String [] args){
       
        Scanner input = new Scanner(System.in);
        int[][] matriz=new int[3][4];
         //input de valores na matriz
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                matriz[i][j]=input.nextInt();
            }
        }
        
        int[] par = separaMatrizPar(matriz, retornaTamanhoPar(matriz));
        int[] impar = separaMatrizImpar(matriz,retornaTamanhoImpar(matriz));
        System.out.println("Elementos pares: ");
        imprimeVetor(par);
        System.out.println("Elementos impares: ");
        imprimeVetor(impar);
    }
}
