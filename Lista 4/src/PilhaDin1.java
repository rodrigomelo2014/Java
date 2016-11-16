import java.util.Scanner;

/*
 * @author Rodrigo da Silva Melo
 */

public class PilhaDin1{
 private char[] vetorPilha;

 public PilhaDin1(){
 vetorPilha = new char[0];
 }
 
 public void push(char obj){
 char auxiliar[] = new char[vetorPilha.length+1];
 for(int i=0;i<vetorPilha.length;i++){
 auxiliar[i] = vetorPilha[i];
 }
 auxiliar[vetorPilha.length] = obj;
 vetorPilha = auxiliar;
 }

 public char pop(){
 if(vetorPilha.length <= 0)
 return 0;
 char auxiliar[] = new char[vetorPilha.length-1];
 for(int i=0;i<vetorPilha.length-1; i++){
 auxiliar[i] = vetorPilha[i];
 }
 char obj = vetorPilha[vetorPilha.length-1];
 vetorPilha = auxiliar;
 return obj;
 }

 public char top(){
 if(vetorPilha.length == 0)
return 'a';
 else
return vetorPilha[vetorPilha.length-1];
}

 public boolean isEmpty(){
 return (vetorPilha.length == 0);
}

 public boolean isFull(){
 return false;
}

    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        PilhaDin1 pilha = new PilhaDin1();
        String frase=leitor.nextLine();
        char [] palavra =frase.toCharArray();
        for(int i=0; i<palavra.length; i++){
            if(palavra[i]!=')')pilha.push(palavra[i]);
            else{
                if(palavra[i]==')'){
                    while(pilha.top()!='('){
                        if(pilha.isEmpty()){
                            pilha.push(palavra[i]);
                            break;
                        }
                        pilha.pop();
                    }
                    if(pilha.top()=='('){
                        pilha.pop();
                    }
                }
            }
        }
        if(pilha.isEmpty())System.out.println("Bem formada!");
        else System.out.println("Mal formada!");
    }
    
}

