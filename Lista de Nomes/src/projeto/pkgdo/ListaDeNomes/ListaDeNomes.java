package projeto.pkgdo.ListaDeNomes;

/*
@author Rodrigo da Silva Melo
 */

import java.util.Scanner;

public class ListaDeNomes {

    public static boolean busca(String nome, String [] listaNomes){
        for(int i=0; i < listaNomes.length ; i++){
            if(listaNomes[i]!=null){
                if(listaNomes[i].equals(nome)){
                    return true;
                }
            }
        }
    return false;
    }

    public static String[] adicionaNome(String nome, String [] listaNomes){
        
        if(busca(nome, listaNomes)!=true){
            if(listaNomes[49]!= null){
                System.out.println("Lista cheia, não é possível adicionar mais nomes!");
            return listaNomes;
            }
                for(int i=0;i<listaNomes.length;i++){
                    if(listaNomes[i]== null){
                        listaNomes[i]=nome;
                    return listaNomes;
                    }
                }
            }
        
        else{
            System.out.println("Nome já consta na lista, não é possível adicioná-lo novamente!");
        }
        
    return listaNomes;
    }

    public static void imprimeNome(String [] listaNomes){
        
        if(listaNomes[0]== null){
            System.out.println("Lista vazia");
        }
        else{
            for(int i=0;i<listaNomes.length;i++){
                if(listaNomes[i]!= null){
                System.out.println(listaNomes[i]);
                }
            }
        }
    }

    public static String buscaNome(String nome, String [] listaNomes){
        for(int i=0; i < listaNomes.length ; i++){
            if(listaNomes[i]!=null){
                if(listaNomes[i].equals(nome)){
                    return "O nome foi encontrado e se encontra na posição "+ i +" do vetor";
                }
            }
        }
    return "O nome digitado não foi encontrado";
    }

    public static String [] removeNome(String nome, String [] listaNomes){
   
        if(busca(nome , listaNomes)== true){
            for(int i=0; i<listaNomes.length;i++){
                if(listaNomes[i].equals(nome)){
                    while(listaNomes[i+1]!= null){
                    listaNomes[i]= listaNomes[i+1];
                    listaNomes[i+1]=null;
                    i++;
                    }
                return listaNomes;
                }
            }
        }
        else{
            System.out.println("O nome digitado não está na lista");
        }
    return listaNomes;
    }


    
    public static void main(String[] args) {
        
        String listaNomes[];
        listaNomes = new String[50];
        Scanner numero = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        String nome;
        int indice;
       
        do{
            
        System.out.println();
        System.out.println("1 - Adicionar um novo nome");
        System.out.println("2 - Apresentar os nomes");
        System.out.println("3 - Pesquisar um nome");
        System.out.println("4 - Remover um nome");
        System.out.println("0 - Sair");
        
        System.out.println("Escolha uma das opcoes acima de acordo com o indice:");
        indice = numero.nextInt();
  

        switch(indice){
            case 1:
            System.out.println("Digite um nome");
            nome = str.nextLine();   
            listaNomes = adicionaNome( nome.toUpperCase() , listaNomes );
            break;
    
            
            case 2:
            imprimeNome(listaNomes);
            break; 
            
            case 3:
            System.out.println("Digite um nome");
            nome = str.nextLine();
            System.out.println(buscaNome( nome.toUpperCase() , listaNomes ));
            break;
           
            case 4:
            System.out.println("Digite um nome");
            nome = str.nextLine();
            listaNomes=removeNome( nome.toUpperCase() , listaNomes );
            break;
            
            case 0:
            System.exit(0);
            break;
            
            default:
            System.out.println("Valor invalido, tente novamente");    
            
          
    }
    
        }while(indice!=0);
}
}


