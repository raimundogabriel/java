package ex9;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float d,v,l,t,kl;
        System.out.println("Entre com a distancia percorrida, o tempo gasto e a g");
        d = s.nextFloat();
        t = s.nextFloat();
        l = s.nextFloat();
        v = d/t;
        kl = d/l;
        System.out.printf("Sua velocidade media é %.2f Km/h e o consumo de combustivel é %.2f Km/l.", v,kl);
        
    }
    
}
