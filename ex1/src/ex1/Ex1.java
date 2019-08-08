package ex1;

import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        int a,b;
        Scanner t = new Scanner(System.in);
        System.out.print("A: ");
        a = t.nextInt();
        System.out.print("B: ");
        b = t.nextInt();
        
        int soma = a+b;
        int sub  = a-b, mult = a*b, div = a/b;
        
        System.out.printf("Soma = %d\n",soma);
        System.out.printf("Subtração = %d\n",sub);
        System.out.printf("Multiplicação = %d\n",mult);
        System.out.printf("Divisão = %d\n",div);
        
    }
    
}
