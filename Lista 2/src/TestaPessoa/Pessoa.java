
package TestaPessoa;

/*
 * @author Rodrigo da Silva Melo
 */
public class Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    
    public Pessoa(String nome, int idade, float peso, float altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    public void mostraNome(){
        System.out.println(this.nome);
    }
    public void mostraIdade(){
        System.out.println(this.idade);
    }
    public void mostraPeso(){
        System.out.println(this.peso);
    }
    public void mostraAltura(){
        System.out.println(this.altura);
    }
    
    
    public void alteraNome(String nome){
        this.nome=nome;
    }
    public void alteraIdade(int idade){
        this.idade=idade;
    }
    public void alteraPeso(int peso){
        this.peso=peso;
    }
    public void alteraAltura(float altura){
        this.altura=altura;
    }
    
    
    public float calculaIMC(){
        return this.peso/(this.altura*this.altura);
    }
    public void imprimeEstado(float imc){
        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        }else if(imc >= 18.5 && imc < 25){
            System.out.println("Peso ideal");
        }else if(imc >= 25 && imc < 30){
            System.out.println("Sobrepeso");
        }else if(imc >= 30 && imc < 35){
            System.out.println("Obesidade grau I");
        }else if(imc >= 35 && imc < 40){
            System.out.println("Obesidade grau II");
        }else{
            System.out.println("Obesidade grau III");
        }
    
    }
}
