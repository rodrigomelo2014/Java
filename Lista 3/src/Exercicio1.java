
/*
 * @author Rodrigo da Silva Melo
 */
public class Exercicio1 {

    public static int somaCol1(int[][]P){
        int soma=0;
        System.out.println("Soma dos quadrados da primeira coluna:");
        for(int i=0; i<P.length;i++){
            for(int j=0; j<1;j++){
                soma+=P[i][j]*P[i][j];
            }
        }   
        
    return soma;
    }
    
    public static int somaCol2(int[][]P){
        int soma=0;
        System.out.println("Soma da segunda coluna:");
        for(int i=0; i<P.length;i++){
            for(int j=1; j<2;j++){
                soma+=P[i][j];
            }
        }   
    return soma;
    }
    
    public static int somaDiagonalPrincipal(int[][]P){
        int soma=0;
        System.out.println("Soma diagonal principal:");
        for(int i=0; i<P.length;i++){
            for(int j=0; j<P.length;j++){
                if(i==j){
                soma+=P[i][j];
                }
            }
        }   
    return soma;
    }
    
    public static int multiplicacaoDiagonalSecundaria(int[][]P){  
        int multiplicacao = 1;  
        System.out.println("Multiplicação diagonal secundária:");
        for(int i=P.length - 1; i >= 0; i--){  
            for(int j=P.length - 1; j >= 0; j--){  
                if(i + j == P.length - 1){  
                    multiplicacao *=P[i][j];  
                }  
            }  
        }  
    return multiplicacao; 
    }  
   
    public static int somaTotal(int[][]P){
        int soma=0;
        System.out.println("Soma de todos os elementos:");
        for(int i=0; i<P.length;i++){
            for(int j=0; j<P.length;j++){
                soma+=P[i][j];
            }
        }   
    return soma;
    }
    
    public static int somaIndiceImparLinha2(int[][]P){
       int soma=0;
       System.out.println("Soma dos elementos de indice impar na segunda coluna:");
       for(int i=1;i<2;i++){
           for(int j=0; j<P.length;j++){
               if(j%2==0){
                   soma+=P[i][j];
               }
           }
       }
       
       
       
    return soma;
    }
    
    
    public static void main(String [] args){
        
        int [][]P = {{1,2,3},{1,2,3},{1,2,3}};
        System.out.println(somaCol1(P));
        System.out.println(somaCol2(P));
        System.out.println(somaDiagonalPrincipal(P));
        System.out.println(multiplicacaoDiagonalSecundaria(P));
        System.out.println(somaTotal(P));
        System.out.println(somaIndiceImparLinha2(P));
    }

}
