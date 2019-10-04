package ex2;
import java.util.Scanner;

public class Principal {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Entre com o modelo do seu carro e a potencia dele para saber a velocidade");
        Carro c = new Carro(s.nextLine(),s.nextFloat());
        System.out.printf("Seu carro corre ate: %.2f",c.velocidadeMaxima());
        
    }
}
