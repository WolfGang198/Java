
package view;

public class ContaPoupanca extends Conta{
    private double saldo;
    
    @Override
    public void deposita(int i) {
        this.saldo = i - 1;
    }

    @Override
    public void atualiza(double taxa){
        this.saldo += this.saldo * (taxa * 3);
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
