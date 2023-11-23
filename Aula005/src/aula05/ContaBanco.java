package aula05;

public class ContaBanco {
    //Atributus
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Construtor
    
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    //metodos
    
    public void estadoAtual(){
        String estado;
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        if (this.getStatus() == true) {
            estado = "Aberta";
        } else {
            estado = "Fechada";
        }
        System.out.println("Status: " + estado);
        System.out.println("----------------------------");
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)){
            this.setSaldo(50);
        }
        else if("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta!!!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta tem dinheiro");
        }
        else if(this.getSaldo() < 0){
            System.out.println("Conta em debito");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada!!!");
        }
    }
    
    public void depositar(float v){
        if(this.getStatus() == true){
            this.setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado!!!");
        }
        else{
            System.out.println("ERRO!!!");
        }
    }
    
    public void sacar(float v){
        if(this.getStatus() == true){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado!!!");
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
        
        if("CC".equals(this.getTipo())){
            v = 12;
        }
        else if("CP".equals(this.getTipo())){
            v = 20;
        }
        if(this.getStatus() == true){
            if(this.getSaldo() > 0){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga!!!");
            }
            else{
                System.out.println("Saldo insuficiente!!!");
            }
        }
        else{
            System.out.println("ERRO!!!");
        }
    }
    
    //Getters e Setters

    public int getNumConta() {
        return numConta;
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

    public boolean getStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
