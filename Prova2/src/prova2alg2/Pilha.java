
package prova2alg2;

/*
 * @author Rodrigo da Silva Melo
 */
public class Pilha {
    // atributos
    private char [] dados;
    private int topo;

    // Cria uma pilha
    public Pilha () {
        dados = new char[50];
        topo = -1;
    }
    
    public boolean isFull() {
        return (topo == dados.length - 1);
    }
    
    public boolean isEmpty() {
        return (topo == -1);
    }
    
    public void push(char x) {
        if (!isFull()) {
            topo++;
            dados[topo] = x;
        }
    }
    
    public char pop() {
        if (!isEmpty()) {
            char x = dados[topo];
            topo--;
            return x;
        }
        return '\u0000';
    }
    
    public char top() {
        if (!isEmpty()) {
            return dados[topo];
        }
        return '\u0000';
    }    
}
