
package view;

public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    public void fazerBarulho() {
        System.out.println("O gato " + getNome() + " faz miau!");
    }
    
}
