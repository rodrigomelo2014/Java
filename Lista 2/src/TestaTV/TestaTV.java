package TestaTV;

/*
 * @author Rodrigo da Silva Melo
 */
public class TestaTV {
    public static void main(String[] args) {
       lista.pkg2.TV tv = new lista.pkg2.TV();
       tv.mostrarCanal();
       tv.mudarCanal(98);
       tv.mostrarCanal();
       tv.mostrarVolume();
       tv.aumentaVolume();
       tv.mostrarVolume();
       tv.diminuiVolume();
       tv.mostrarVolume();
       tv.mostrarEstado();
       tv.ligar();
       tv.mostrarEstado();
    }
}
