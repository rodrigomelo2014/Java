
/*
 * @author Rodrigo
 */
public class Exercicio2 {
    //imprime uma matriz
    public static void imprimeMatriz(int[][]A){
        
        for(int i=0; i<A.length; i++){
           System.out.println();
           for(int j=0; j<A[0].length;j++){
               System.out.print(A[i][j]+"  ");
           }
       }
    }
    //recebe uma matriz e imprime a transposta dela
    public static void imprimeMatrizTransposta(int [][]A, int linha, int coluna){
        int[][]mat=new int [coluna][linha];
        
        for(int i=0; i<mat.length; i++){
           System.out.println();
           for(int j=0; j<mat[i].length;j++){
               mat[i][j]=A[j][i];
               System.out.print(mat[i][j]+"  ");
           }
       }
    }
    
    
    public static void main(String [] args){
       int[][]A={{9,16,34,4},{32,11,17,3}}; 
       
       System.out.print("Matriz:");
       imprimeMatriz(A);
       System.out.println();
       
       //verifica se as dimensões da matriz correspondem com as passadas no enunciado
        if(A.length <=5 && A[0].length <=5 ){
            System.out.print("Matriz transposta:");
            imprimeMatrizTransposta(A, A.length, A[0].length);
            System.out.println();
        }
    }
}
