package ex7;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float salario,com,total;
        int vendas;
        System.out.println("Entre com o salario do funcionario: ");
        salario = s.nextFloat();
        System.out.println("entre com o percentual da comissão: ");
        com = s.nextFloat();
        System.out.println("Entre com a quantidade de vendas: ");
        vendas = s.nextInt();
        total = salario+(com*vendas);
        System.out.println("O salario final com "+vendas+"fica: "+total);
    }
    
}
