package model;

public class Venda {
private float tot;

    public void totVenda(){
        System.out.println("Um milhão de reais em ouro que vale mais doque dinheiro!!!");
    }

    public float getTot() {
        return tot;
    }

    public void setTot(float tot) {
        this.tot = tot;
    }

    public Produto getTot(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
