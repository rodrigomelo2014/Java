package newpackage;

import static java.lang.Math.abs;
import java.util.Random;
/*
 * @author Rodrigo Melo
 */
public class aviao {
       
    public static void main(String [] args){
       Random rand = new Random(); 
       int decisao = rand.nextInt(2)+1;
       int velocidade = 0, altura = 0, distancia = 10000;
       double x=0, y=0, xAtual=0, yAtual=0;
       int grau = rand.nextInt(359)+1;
       int mudarCurso=0;
       boolean sucesso, fugir=false;
       int direcaoGraus;
       int positivo= rand.nextInt(2)+1;
       double elevacao;
       
       System.out.println(grau+" graus");
       //definindo coordenadas x e y de acordo com o grau
       if(grau==360){
           x=0;
           y=10000;
       }else if(grau==90){
           x=10000;
           y=0;
       }else if(grau==180){
           x=0;
           y=-10000;
       }else if(grau==270){
           x=-10000;
           y=0;
       }
       else{
           if(grau < 90){
               x=(grau*111.11111111);
               y=Math.sqrt((10000*10000)-x*x); 
           }else if(grau > 90 && grau < 180){
               x=10000-((grau-90)*111.11111111);
               y=Math.sqrt((10000*10000)-x*x)*(-1);
           }else if(grau > 180 && grau < 270){
               x=((grau-180)*111.11111111);
               y=Math.sqrt((10000*10000)-x*x)*(-1);
               x=x*(-1);
           }else if(grau > 270 && grau < 360){
               x=-10000+((grau-270)*111.11111111);
               y=Math.sqrt((10000*10000)-x*x); 
               
           }
       }
       
       System.out.println("x= "+ x +", y= "+ y);
       
       //define se o avião entrou no raio de 1km
       if(x*x + y*y < 1000*1000)sucesso = false;
       //tipos de trajetória aleatória A e B
          if(decisao == 1){
            System.out.println("Trajeto direto");
            altura = 200;
            velocidade = 67; //metros por segundo
          }
          else{
              System.out.println("Trajeto indireto");
              double tempo = rand.nextGaussian()+ 7.5;
              System.out.printf("%.2f segundos\n", tempo);
              altura = 500;
              velocidade = 111;//metros por segundo
              if(positivo==21)direcaoGraus = rand.nextInt(65)+10;
              else direcaoGraus = (rand.nextInt(65)+10)*(-1);
              System.out.println(direcaoGraus);
              
          }          
       
        System.out.println("Angulo de elevação "+Math.round(Math.toDegrees(Math.atan(altura/distancia))));
        System.out.println("Azimute "+Math.toDegrees(Math.atan(xAtual-abs(x)/yAtual-abs(y))));
      //alteração do curso B    
      if(x*x + y*y < 3000*3000){
           mudarCurso=rand.nextInt(10)+1;
           if(mudarCurso==1){
               altura = 1200;
               velocidade = 208; //metros por segundo
           }
       }
       System.out.println("altura: "+altura+", velocidade: "+velocidade);
    
    /*
       for(int i=1; i<=360; i++){
         if(i==360){
           x=0;
           y=10000;
       }else if(i==90){
           x=10000;
           y=0;
       }else if(i==180){
           x=0;
           y=-10000;
       }else if(i==270){
           x=-10000;
           y=0;
       }
       else{
           if(i < 90){
               x=(i*111.11111111);
               y=Math.sqrt((10000*10000)-x*x); 
           }else if(i > 90 && i < 180){
               x=10000-((i-90)*111.11111111);
               y=Math.sqrt((10000*10000)-x*x)*(-1);
           }else if(i > 180 && i < 270){
               x=((i-180)*111.11111111);
               y=Math.sqrt((10000*10000)-x*x)*(-1);
               x=x*(-1);
           }else if(i > 270 && i < 360){
               x=-10000+((i-270)*111.11111111);
               y=Math.sqrt((10000*10000)-x*x); 
               
           }
       }
         System.out.println("x= "+ x +", y= "+ y);
    }
    */
    }
}
