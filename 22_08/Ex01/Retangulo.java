package ex01;
public class Retangulo {
    private int largura;
    private int altura;
    private int x;
    private int y;
    public void setLargura(int l){
        largura=l;
    }
    public int getLargura(){
        return largura;
    }
    public void setAltura(int a){
        altura = a;
    }
    public int getAltura(){
        return altura;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }

    
    public Retangulo(int l,int a,int x,int y){
        this.largura = l;
        this.altura = a;
        this.x = x;
        this.y = y;
    }
}

