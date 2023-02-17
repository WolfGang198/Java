
package aula04;

public class Caneta {
    public String modelo;
    private Float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String m, String c, Float p){//metodo construtor
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelos(String m){
        this.modelo = m;
    }
    
    public Float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(Float p){
        this.ponta = p;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void Status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamapada: " + this.tampada);
    }
}
