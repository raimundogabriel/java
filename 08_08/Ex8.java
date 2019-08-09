package ex8;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        final float sh,sm;
        sh=3600;
        sm=60;
        float t,hora, min;
        Scanner s = new Scanner(System.in);
        System.out.println("informe um tempo em segundos: ");
        t = s.nextFloat();
        hora = t/sh;
        min = t/sm;
        System.out.printf("%.2f em minutos sao %.2f e em horas %.2f",t,min,hora);
        
        
        
    }
    
}
