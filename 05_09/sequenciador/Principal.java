package Principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int i,f,p;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Entre com o inicio e o fim da sequencia:");
        i = s.nextInt();
        f = s.nextInt();
        Sequencia s1 = new Sequencia(i,f);
        System.out.println("entre com um pulador");
        p = s.nextInt();
        s1.imprimir();
        s1.imprimir(p);
        
    }
    
}
