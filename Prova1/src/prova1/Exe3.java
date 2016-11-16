
package prova1;
import java.util.Scanner;
/*
 * @author Rodrigo da Silva Melo
 */
public class Exe3 {
    public static void main(String [] args){
        Scanner acesso = new Scanner(System.in);
        String loginCorreto = "Rodrigo";
        String senhaCorreta = "SENAC";
        String login = new String();
        String senha = new String();
        int contador = 3;
        
        do{
        System.out.println("Por gentileza, entre com o seu Login: ");
        login= acesso.nextLine();
        System.out.println("Por gentileza, digite a sua senha: ");
        senha= acesso.nextLine();
        
        /*Validador do usuário e senha*/
        
        if(login.equals(loginCorreto) && senha.equals(senhaCorreta)){
            System.out.println("Login efetuado com sucesso");
            break;
        }
        else{
            contador--;
            if(contador==0){
                break;
            }
            System.out.print("\n Login e/ou senha inválido(s), por gentileza, tente novamente, você ainda tem "+contador+" chance(s) \n");
            System.out.print("\n \n \n \n");
            
        }
        }while(contador!=0);  
    }
    
}
