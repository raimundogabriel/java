  package ex1;

import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        float pi = 3.14f;                                     //costane de PI
        float v,r,a;
        Scanner s = new Scanner(System.in);
        System.out.println("Entre com o raio da lata:");      //entro com o valor do raio
        r = s.nextFloat();
        System.out.println("Entre com a alura da lata:");     //entro com o valor da altura
        a = s.nextFloat();
        v = pi*r*r*a;                                         //faço o calculo da area
        System.out.printf("a area desta lata e :%.2f", v);
        
    }
    
}
