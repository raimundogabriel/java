package Principal;

public class Sequencia {
    private int i;
    private int f;
    private int p;
    
    public int getI(){
        return this.i;
    }
    public void setI(int i){
        this.i = i;
    }
    public int getF(){
        return this.f;
    }
    public void setF(int f){
        this.f = f;
    }
    public int getP(){
        return this.p;
    }
    public void setP(int p){
        this.p = p;
    }
    public Sequencia(int i,int f){
        this.i = i;
        this.f = f;
    }
    public Sequencia(int i, int f, int p){
        this.i = i;
        this.f = f;
        this.p = p;
    }
    public Sequencia(Sequencia s){
        this.i = s.i;
        this.f = s.f;
        this.p = s.p;
    }
    public void imprimir(){
        for (int i = this.i;i<=f;i++){
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
    public void imprimir(int p){
        for(int i = this.i; i <= this.f; i+=p){
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
