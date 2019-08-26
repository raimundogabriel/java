package ex5;
import java.util.Scanner;
public class Ex5 {
    
    public static void main(String[] args) {
        int i,u,d,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Entre com um numero:");//Entro com o numero
        i = s.nextInt();
        if(i>=100 &&i<=999){                       //somente numeros com 3 digitos
            u=i%10;                                //faço o calculo para separar cada digito
            i/=10;
            d=i%10;
            i/=10;
            c=i%10;
            System.out.printf("este numero tem %d unidadesdes %d dezenas %d centenas\n",u,d,c);
            System.out.printf("a soma desses digios é %d",u+d+c);
        }
        
        
    }
    
}
