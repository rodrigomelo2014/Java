package pi.vi;

import java.util.Random;
import java.util.Scanner;

/*
 * @author Rodrigo Melo
 */

public class PIVI {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        
        
        System.out.println("Digite o número mínimo de pacientes que serão atendidos no dia: ");
        int minPacientes = reader.nextInt();
        System.out.println("Digite o número máximo de pacientes que serão atendidos no dia: ");
        int maxPacientes = reader.nextInt();
        
        
        // variavel com o numero total de pacientes gera um numero dentro do intervalo dado
        int pacientes = random.nextInt(maxPacientes-minPacientes)+minPacientes;
        // contador total de minutos usado para saber a quantia de trabalho necessaria no dia
        double contadorMinutos=0;
        //variavel usada para definir a probabilidade de ocorrencia de exame na consulta
        int probabilidadeDeExame;
        
        //loop que define o tempo gasto na consulta de cada paciente
        //variavel recebe um valor entre 1 e 10
        //dependendo do resultado, gera uma quantidade de minutos,
        //as probabilidades são 70% da consulta durar entre 60 e 90 minutos e 30% de durar entre 8 e 12 minutos; 
        for(int contadorDePacientes=0; contadorDePacientes<pacientes; contadorDePacientes++){
            probabilidadeDeExame = random.nextInt(9)+1;
            
            if(probabilidadeDeExame<=3){
                contadorMinutos+= random.nextInt(4)+8;
            }else{
                contadorMinutos+= random.nextInt(60)+30;
            }
        }
       
        System.out.println("Digite o número mínimo de médicos: ");
        int minMedicos = reader.nextInt();
        System.out.println("Digite o número máximo de médicos: ");
        int maxMedicos = reader.nextInt();
        
        
        //pega o total de minutos, converte em horas e divide pelo numero de médicos para saber o tempo de trabalho necessario de cada um
        System.out.println("O tempo gasto será:");
        for(int contadorDeMedicos = minMedicos; contadorDeMedicos <= maxMedicos ; contadorDeMedicos++){
            System.out.printf("%.2f horas por médico sendo %d médicos. \n",((contadorMinutos/60)/contadorDeMedicos), contadorDeMedicos);
        }
    }
}
