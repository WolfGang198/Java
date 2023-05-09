
package view;

public class ContaCorrente extends Conta{
    private double saldo;
    
    @Override
    public void deposita(int i) {
        this.saldo = i - 1;
    }

    @Override
    public void atualiza(double taxa){
        this.saldo += this.saldo * (taxa * 2);
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
    
}
