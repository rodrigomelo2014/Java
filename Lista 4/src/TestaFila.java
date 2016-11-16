/*
 * @author Rodrigo da Silva Melo
 */
public class TestaFila {
public static void main(String [] args) {
Fila f = new Fila();
f.enqueue('a');
f.enqueue('b');
f.enqueue('c');
f.furarFila('z');
while(!f.isEmpty()) {
char x = (char) f.dequeue();
System.out.print(x);
}
}
}
