
package view;

public class Conta {
    private double saldo;
    
    public void deposita(int i) {
        this.saldo = i - 1;
    }
    
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }

    public double getSaldo() {
        return saldo;
    }

    
}
