
package model;

public class Fornecedor{
    private String nome = "";
    private String contato = "";
    
    public void cadFornecedor(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        this.nome = "Ajax";
        this.contato = "+33-666-8888";
        System.out.println("Cadastro bem sucedido!!!");
        System.out.println("");
        System.out.println("==============");
        System.out.println(" [6] - voltar ");
        System.out.println("==============");
        System.out.println("");
    }
    
    public void cadStatus(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Contato: " + this.contato);
        System.out.println("==============");
        System.out.println(" [6] - voltar ");
        System.out.println("==============");
        System.out.println("");
    }
    
    
}
