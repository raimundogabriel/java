package ex10;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero");
        i = s.nextInt();
        
        if(i%2>0){
            System.out.printf("o numero %d e impar", i);
        }else{
            System.out.printf("o numero %d e par", i);
        }
    }
    
}
