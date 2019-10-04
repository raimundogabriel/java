package ex2;

public class Carro {
    private String modelo;
    private Motor motor;
    public void setModelo(String modelo){
        this.modelo = modelo;
        
    }
    public String getModelo(){
        return this.modelo;
    }
    public Carro(String modelo,float cilindrada){
        motor = new Motor();
        this.modelo = modelo;
        motor.setCilindradas(cilindrada);        
    }
    
    public float velocidadeMaxima(){
        float vm;
        if(motor.getCilindradas()<1){
            vm = 140;
        }        
        else{
            if(motor.getCilindradas()<1.6){
                vm = 180;
            }
            else{
                if(motor.getCilindradas()<2.0){
                    vm = 220;
                }
                else{
                    vm = 260;
                }
            }                    
        }
        return vm;
    }
    
    
}
