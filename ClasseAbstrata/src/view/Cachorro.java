
package view;


public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    public void fazerBarulho(){
        System.out.println("O cachorro " + getNome() + " faz au au!");
    }
}
