package banco2;

public class ContaBanco {
    
    //atributos...
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //construtor...
    
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    
    //metodos...
    
    public void abrirConta(){
        this.setTipo(tipo);
        this.setStatus(true);
        if(tipo == "CC"){
            this.saldo = 50;
        }
        else if(tipo == "CP"){
            this.saldo = 150;
        }
        else{
            this.setStatus(false);
        }
    }
    
    public void fecharConta(){
        if (saldo > 0){
            System.out.println("Conta tem dinheiro");
        }
        else if(saldo < 0){
            System.out.println("Conta em debito");
        }
    }
    
    public void depositar(float v){
        if(status == true){
            this.setSaldo(getSaldo() + v);
        }
        else{
            System.out.println("ERRO!!!");
        }
    }
    
    public void sacar(float v){
        if(status == true){
            if(saldo > 0){
                this.saldo = saldo + v;
            }
            else{
                System.out.println("Saldo insuficiente!!!");
            }
        }
        else{
            System.out.println("ERRO!!!");
        }
    }
    
    public void pagarMensalidade(){
        float v = 0;
        
        if(tipo == "CC"){
            v = 12;
        }
        else if(tipo == "CP"){
            v = 20;
        }
        if(status == true){
            if(saldo > 0){
                this.saldo = saldo - v;
            }
            else{
                System.out.println("Saldo insuficiente!!!");
            }
        }
        else{
            System.out.println("ERRO!!!");
        }
    }
    
    //getters e setters...

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}