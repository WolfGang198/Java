package aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String m, String c, float p){
        this.cor = c;
        this.modelo = m;
        this.ponta = p;
        this.tampar();
    }
    
}
