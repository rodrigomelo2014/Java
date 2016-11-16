
package prova2alg2;

/*
 * @author Rodrigo da Silva Melo
 */
public class Fila {
    // atributos
    private int [] dados;
    private int inicio;
    private int fim;
    
    // construtor
    public Fila() {
        dados = new int[50];        
        inicio = 0;
        fim = 0;
    }
    
    public boolean isFull() {
        return (fim + 1) % dados.length == inicio;
    }
    
    public boolean isEmpty() {
        return (inicio == fim);
    }
    
    public void enqueue(int x) {
        if (!isFull()) {
            dados[fim] = x;
            fim++;
            if (fim == dados.length) {
                fim = 0;
            }            
        }
    }
    
    public int dequeue() {
        if (!isEmpty()) {
            int x = dados[inicio];
            inicio++;
            if (inicio == dados.length) {
                inicio = 0;
            }            
            return x;
        }
        return 0;
    }
    
    public int front(){
        return (int) dados[inicio];
    }
    
}
