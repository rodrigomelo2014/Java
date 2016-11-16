/**
 *
 * @author Rodrigo
 */
public class Exercicio3 {
    static void bubbleSort (int [] vetor) {
        int aux = 0;
        int completou=0;
        // Fase de Ordenação
        for (int i = 0; (i < vetor.length - 1)&&completou==0; i++) {
            completou=1;
            for (int j = 0; j < vetor.length - i - 1; j++) {
        // Troca dos Elementos
                if (vetor[j] > vetor[j+1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                    completou=0;
                }
            }
        }
    }
    public static void imprimeVetor(int [] novoVetor){
        for(int i=0;i<novoVetor.length;i++){
            System.out.println(novoVetor[i]);
        }
    }
public static void main(String[] args){
    int [] vet={3,5,8,2,1,8,58,6};
    bubbleSort(vet);
    imprimeVetor(vet);
}
}
