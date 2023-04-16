
package model;

public class Venda {
    private float tot;

    public void totVenda(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Um milhao de reais em ouro que vale mais doque dinheiro!!!");
        System.out.println("");
        System.out.println("==============");
        System.out.println(" [6] - voltar ");
        System.out.println("==============");
        System.out.println("");
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
