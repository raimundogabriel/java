package ex6;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float t1,t2,t3,t4,p1,p2,p3,p4,total;
        System.out.println("Entre com os valores de cada prova: ");
        t1 = s.nextFloat();
        t2 = s.nextFloat();
        t3 = s.nextFloat();
        t4 = s.nextFloat();
        System.out.println("Entre com os valores de cada peso: ");
        p1 = s.nextFloat();
        p2 = s.nextFloat();
        p3 = s.nextFloat();
        p4 = s.nextFloat();
        total=(t1+t2+t3+t4)/(p1+p2+p3+p4);
        System.out.println("a media ponderada e: "+total);
        
    }
    
}
