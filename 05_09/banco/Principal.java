package principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int aux = 0;
        float deposito,saque;
        Scanner s = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente();        
        System.out.println("Entre com um deposito");
        deposito = s.nextFloat();
        cc.depositar(deposito);
        System.out.printf("Saque algum dinheiro da sua conta que o saldo é %.2f\n",cc.getSaldo());
        saque = s.nextFloat();
        cc.sacar(saque);
        
        while(aux!=4){
            System.out.println("1 - Consultar saldo \n2 - Depositar \n3 - Sacar\n4 - Fim");
            aux = s.nextInt();
            if(aux == 1){
                cc.getSaldo();
            }
            else{
                if(aux == 2){
                    cc.depositar(s.nextFloat());
                }
                else{
                    if(aux == 3){
                        cc.sacar(s.nextFloat());
                        
                    }
                }
            }
        }
        
    }
    
}
