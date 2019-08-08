package ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
       float salario, pagamento,fim;
       System.out.println("Indique o salario: ");
       Scanner s = new Scanner(System.in);
       salario = s.nextFloat();
       System.out.println("infome a porcentagem de aumento: ");
       pagamento = s.nextFloat();
//      System.out.println("Seu novo salário é "+(salario+(salario*pagamento)));
       fim=salario+(salario*pagamento);
       System.out.println("seu salario agora é:"+fim);
    }
    
}
