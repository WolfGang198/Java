package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1);
        p1.abrirConta("CC");
        p1.setDono("Jubileu");
        p1.depositar(300f);
        p1.sacar(350f);
        p1.fecharConta();
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2);
        p2.abrirConta("CP");
        p2.setDono("Creuza");
        p2.depositar(500f);
        p2.sacar(100f);
        p2.estadoAtual();
    }
    
}
