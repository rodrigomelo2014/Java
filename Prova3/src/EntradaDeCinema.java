/**
 *
// * @author Rodrigo da Silva Melo
 */
public class EntradaDeCinema {
    private int[] data;
    private int horario;
    private int sala;
    private float valor;
    
    public EntradaDeCinema(int[] data, int horario, int sala, float valor){
        this.data=data;
        this.horario=horario;
        this.sala=sala;
        this.valor=valor;
    }
    public void aplicaDesconto50(){
        this.valor=this.valor/2;
    }
    public void aplicaDesconto10(){
        this.valor=(float) (this.valor*0.9);
    }
    public void calcularDescontoIdade(int anoNasc){
        if((2016-anoNasc)<12){
        aplicaDesconto50();
        }
    }
    public void calcularDescontoHorario(int horario){
        if((16-horario)>0){
        aplicaDesconto10();
        }
    }
    public void imprime(){
        System.out.printf("Data: "+this.data[0]+"/"+this.data[1]+"/"+this.data[2]+"\n");
        System.out.println("horario: "+this.horario+"hrs.");
        System.out.println("sala: "+this.sala);
        System.out.println("valor: R$"+this.valor);
    }
    }

