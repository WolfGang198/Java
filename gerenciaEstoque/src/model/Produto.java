
package model;

public class Produto {
    private String nome = "";
    private long codBarras = 0l;
    private String dataValidade = "";
    private int qtd = 0;
    private float preco = 0f;
    
    public void cadProduto(){
        this.nome = "Shampoo";
        this.codBarras = 7986456356678l;
        this.dataValidade = "23/08/2025";
        this.qtd = 10;
        this.preco = 43.95f;
        System.out.println("Cadastrado com sucesso!!!");
        System.out.println("");
    }
    
    public void Inserir(){
        this.qtd = qtd + 1;
    }
    
    public void Remover(){
        this.qtd = qtd - 11;
        if(qtd == -1){
            System.out.println("Sem estoque!!!");
            System.out.println("");
            this.qtd = qtd + 1; 
        }
    }
    
    public int cadStatus(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cod/Barras: " + this.codBarras);
        System.out.println("Data/Validade: " + this.dataValidade);
        System.out.println("Quantidade: " + this.qtd);
        System.out.println("Preço: R$" + this.preco);
        return 0;
    }

    public int getQtd() {
        return qtd;
    }

    public float getPreco() {
        return preco;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
