
package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private Float saldo;
    private boolean status;
    
    public ContaBanco(){
        this.saldo = 0f;
        this.status = false;
    }
    
    public void setNumConta(int n){
        this.numConta = n;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setDono(String d){
        this.tipo = d;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void abrirConta(){
        
    }
    
    public void fecharConta(){
        
    }
    
    public void depositar(){
        
    }
    
    public void sacar(){
        
    }
    
    public void pagarMensal(){
        
    }
}
