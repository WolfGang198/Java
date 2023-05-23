
package view;

abstract class Animal {//classe abstrata
    private String nome;

    public Animal(String nome) {// setter
        this.nome = nome;
    }

    public String getNome() { // getter
        return nome;
    }
    
    public abstract void fazerBarulho(); //metodo
    
}
