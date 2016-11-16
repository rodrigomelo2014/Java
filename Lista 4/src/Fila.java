
/*
 * @author Rodrigo da Silva Melo
 */
    public class Fila{
// atributos
private Object [] dados;
private int inicio;
private int fim;
// construtor
public Fila() {
dados = new Object[50];
inicio = 0;
fim = 0;
}
public boolean isFull() {
return (fim + 1) % dados.length == inicio;
}
public boolean isEmpty() {
return (inicio == fim);
}
public void enqueue(Object x) {
if (!isFull()) {
dados[fim] = x;
fim++;
if (fim == dados.length) {
fim = 0;
}
}
}
public Object dequeue() {
if (!isEmpty()) {
Object x = dados[inicio];
inicio++;
if (inicio == dados.length) {
inicio = 0;
}
return x;
}
return null;
}

public void furarFila(Object x){
    if (!isFull()){
        dados[fim] = x;
        inicio = fim;
        fim -=1;
    if (fim == dados.length) {
        fim = 0;
    }
    }    
}

public static void main(String []args){
    
}
} 

