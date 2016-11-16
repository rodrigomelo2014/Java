import java.util.Scanner;

/*
 * @author Rodrigo da Silva Melo
 */
public class Exercicio3 {
    
    public static void imprimeMatriz(String[][]matrizAdjacencias){
        int contador=0;
        for(int i=0; i<matrizAdjacencias.length; i++){
           System.out.println();
           
           for(int j=0; j<matrizAdjacencias[0].length;j++){
               
               contador++;
               if(i<1){
               System.out.print(contador +" - "+matrizAdjacencias[i][j]+"  ");
               }
               else{
                   System.out.print(matrizAdjacencias[i][j]+"  ");
               
               }
           }
       }
    }
    
    public static String [][] addCidade(String[][] matrizAdjacencias, String Cidade){
        Scanner leitor = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<=1; i++){
            for(int j=0; j<matrizAdjacencias[0].length;j++){
               if(matrizAdjacencias[i][j]==null){
                   matrizAdjacencias[i][j]= Cidade;
                   addDivisa(matrizAdjacencias, Cidade);
                   System.out.println("Gostaria de adicionar mais localidades na sua matriz? Se sim, digite 1, do contrário digite outro numero: ");
                    int add = leitor.nextInt();
                    if(add==1){
                        System.out.println("Digite a cidade que deseja incluir: ");
                        Cidade=scanner.nextLine();
                        addCidade(matrizAdjacencias, Cidade);
                    }
                    return matrizAdjacencias;
                    }
       }
    }
    return matrizAdjacencias;
    }
    
    
    public static String [][] addDivisa(String[][] matrizAdjacencias, String Cidade){
 
        for(int i=0; i<matrizAdjacencias.length; i++){
            Scanner scanner= new Scanner(System.in);
            String divisa;
            for(int j=0; j<matrizAdjacencias[0].length;j++){
                if(matrizAdjacencias[i][j]==null){
                    return matrizAdjacencias;
                }if(Cidade.equals(matrizAdjacencias[i][j])){
                    matrizAdjacencias[i+1][j]="1";
                }
                else{
                    System.out.println("Digite 1 se a localidade "+Cidade+" faz divisa com "+matrizAdjacencias[i][j]+" e qualquer outro número se não: ");
                    divisa=scanner.nextLine();
                    if(divisa.equals("1")){
                    matrizAdjacencias[i+1][j]="1    ";
                }else{
                    matrizAdjacencias[i+1][j]="0    ";
                }
                }
                
            }
        }
    return matrizAdjacencias;
    }          
    
    public static void main(String [] args){
        String [][]matrizAdjacencias= new String[5][5];
        String Cidade;
        int posicaoCidade1, posicaoCidade2;
        int opcao;
        Scanner leitor= new Scanner(System.in);
        Scanner scanner= new Scanner(System.in);
        
        while(true){
        System.out.println("O quê você gostaria de fazer?");
        System.out.println("Digite 1 para adicionar uma nova localidade: ");
        System.out.println("Digite 2 para imprimir todas as localidades: ");
        System.out.println("Digite 3 para checar se duas localidades fazem divisa: ");
        System.out.println("Se desejar sair digite 0:  ");
        
        opcao=leitor.nextInt();
        
        if(opcao==0){
            break;
        }
        if(opcao==1){
            System.out.println("Digite a cidade que deseja incluir: ");
            Cidade=scanner.nextLine();
            addCidade(matrizAdjacencias, Cidade);
        }
        if(opcao==2){
            imprimeMatriz(matrizAdjacencias);
        }
        if(opcao==3){
            System.out.println("Digite o numero das duas localidades para saber se elas fazem divisa: ");
            posicaoCidade1=leitor.nextInt();
            posicaoCidade2=leitor.nextInt();
            
        }
        
        System.out.print("\n \n ");
        
    }
        
    }
}


