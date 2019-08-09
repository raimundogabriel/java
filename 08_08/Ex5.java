package ex5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        float c, f;
        Scanner s = new Scanner(System.in);
        System.out.println("Entre com a temperatura em Celsius: ");
        c=s.nextFloat();
        f=32+((9*c)/5);
        System.out.println(c+"graus Celsius em Fahrenheit e igual a = "+f);
    }
    
}
