package principal;

public class ContaCorrente {
    private float saldo;
    
    public float getSaldo(){
        System.out.println(this.saldo);
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public void depositar(float quantia){
        System.out.println("deposito feito com sucesso.");
        saldo += quantia;
    }
    
    public boolean sacar(float quantia){
        if(quantia+1.5f <= saldo){
            saldo-=(quantia+ 1.5f);
            System.out.println("-------Dinheiro saindo-------");
            return true;
        }
        else{
            System.out.println("-------Saldo insuficiente-------");
            return false;
        }
    }
}
