package test;

import java.io.IOException;
import java.util.Scanner;

public class MMS {

	    public static void main(String[] args) throws IOException {
	 
	     Scanner leitor = new Scanner(System.in);
	     
	     int x=leitor.nextInt();
	     int y=leitor.nextInt();
	     int [][] matriz;
	     int [][] matrizBinaria;
	     int maior;
	     int verifica;
	     
	     while(x!=0 && y!=0){
	        matriz = new int[x][y];
	        matrizBinaria = new int[x][y];
	        maior=1;
	        verifica=1;
	        
	        //preenche matriz
	     for(int i=0; i<matriz.length; i++){
	         for(int j=0; j<matriz[0].length; j++){
	            matriz[i][j]=leitor.nextInt(); 
	        }
	     }
	    //linha
	     for(int i=0; i<matriz.length; i++){
	         for(int j=1; j<matriz[0].length; j++){
	            if(matriz[i][j]>matriz[i][j-1])verifica+=1; 
	            if(maior<verifica)maior=verifica;
	            if(matriz[i][j]<matriz[i][j-1])verifica=1;
	         }
	        verifica=1;
	     }
	     //coluna
	     for(int i=0; i<matriz[0].length; i++){
	         for(int j=1; j<matriz.length; j++){
	            if(matriz[j][i]>matriz[j-1][i])verifica+=1; 
	            if(maior<verifica)maior=verifica;
	            if(matriz[j][i]<matriz[j-1][i])verifica=1;
	         }
	         verifica=1;
	     }
	     
	     //matriz
	     for(int i=0; i<matriz.length; i++){
	         for(int j=1; j<matriz[0].length; j++){
	            if(matriz[i][j]>matriz[i][j-1]){
	                matrizBinaria[i][j]=1;
	                matrizBinaria[i][j-1]=1;
	            }else matrizBinaria[i][j]=0;
	         }
	     }
	     for(int i=0; i<matriz.length; i++){
	         for(int j=1; j<matriz[0].length-1; j++){
	            if(matriz[i][j]>matriz[i][j-1] && matriz[i][j]<matriz[i][j+1])matriz[i][j+1]=0;             
	         }
	     }
	     //checa cantos
	     if(matrizBinaria[0][0]==1 && (matrizBinaria[0][1]==0 || matrizBinaria[1][0]==0 ||
	        matrizBinaria[1][1]==0))matrizBinaria[0][0]=0;
	     if(matrizBinaria[matriz.length-1][0]==1 &&  (matrizBinaria[matriz.length-1][1]==0 ||
	        matrizBinaria[matriz.length-2][0]==0 || matrizBinaria[matriz.length-2][1]==0))matrizBinaria[matriz.length-1][0]=0;
	     if(matrizBinaria[0][matriz[0].length-1]==1 && (matrizBinaria[0][matriz[0].length-2]==0 ||
	        matrizBinaria[1][matriz[0].length-1]==0 || matrizBinaria[1][matriz[0].length-2]==0 ))matrizBinaria[0][matriz[0].length-1]=0;
	     if(matriz[matriz.length-1][matriz[0].length-1]==1 && (matriz[matriz.length-2][matriz[0].length-1]==0 || 
	        matriz[matriz.length-2][matriz[0].length-2]==0 || matriz[matriz.length-1][matriz[0].length-2]==0 ))matrizBinaria[matriz.length-1][matriz[0].length-1]=0;
	     
	     //retira os impares
	     for(int i=1;i<matriz.length-2; i++){
	         for(int j=1; j<matriz[0].length-2; j++){
	            if(matrizBinaria[i][j]==1){
	                if(matrizBinaria[i+1][j]==0 && matrizBinaria[i-1][j]==0 )matrizBinaria[i][j]=0;
	                else if(matrizBinaria[i][j+1]==0 && matrizBinaria[i][j-1]==0 )matrizBinaria[i][j]=0;
	            }  
	         }
	     }
	     verifica=0;
	     for(int i=1; i<matriz.length-1; i++){
	         for(int j=0;j<matriz[0].length-1; j++){
	             if(i>=matriz.length-1)break;
	             if(matrizBinaria[i][j]==1){
	                 for(int k=matriz[0].length-1;k>0; k--){
	                     if(matrizBinaria[i-1][j]==1){
	                        if(matrizBinaria[i-1][k]==1){
	                            if(matriz[i][j]>matriz[i-1][k]){
	                                 verifica+=2*(k-j);
	                                 i+=1;
	                                if(i>=matriz.length-1)break;
	                                if(matrizBinaria[i+1][j]==1 && matriz[i+1][j]>matriz[i][k]){
	                                    verifica+=k-j;
	                                    i+=1;
	                                }
	                            }
	                        }
	                     }
	                 }
	             }
	             if(verifica>maior)maior=verifica;
	             else verifica=1;
	         }
	     }
	     
	     System.out.println(maior);
	     
	     x=leitor.nextInt();
	     y=leitor.nextInt();
	     }
	     leitor.close();
	    }
	 
	}