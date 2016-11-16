
package TestaTV;

/*
 * @author Rodrigo da Silva Melo
 */

public class TV {
    private boolean ligada;
    private int canal;
    private int volume;
    
public TV () {
ligada=false;
canal=2;
volume=10;
}
public void ligar () {
    if(ligada==true){
        ligada = false;
    }else{
        ligada=true;
    }
}
public void mudarCanal (int numeroCanal) {
    if(canal>=0 && canal<=99){
    canal=numeroCanal;
    }
}
public void aumentaVolume(){
    if(volume<20){
    volume+=1;
    }
}
public void diminuiVolume(){
    if(volume>0){
    volume-=1;
    }
}
public void mostrarCanal(){
    System.out.println("Canal: "+this.canal);
}
public void mostrarVolume(){
    System.out.println("Volume: "+this.volume);
}
public void mostrarEstado(){
    if(ligada==true){
        System.out.println("Está ligada!");
    }else{
        System.out.println("Está desligada!");
    }
}

}