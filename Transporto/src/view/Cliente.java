
package view;

public class Cliente {
    private String nome;
     
     
     
    public Viagem v1 = new Viagem();
    public Caminhoneiro cm1 = new Caminhoneiro();
    public Carreta c1 = new Carreta();
    
    public Cliente() {
        
    }

    
    public void visualizarViagem(){
        nome = "Rafael";
        cm1.setNome("Jorge");
        c1.setModeloCarreta("AJAX F-400");
        v1.setDestino("Piracicaba");
        v1.setValorKm(5.30f);
        v1.setDistancia(430);
        v1.calculaViagem();
        System.out.println("Cliente: " + nome);
        System.out.println("Motorista: " + cm1.getNome());
        System.out.println("Veiculo: " + c1.getModeloCarreta());
        System.out.println("Destino: " + v1.getDestino());
        System.out.println("Valor Km: R$" + v1.getValorKm() + " Distancia: " + v1.getDistancia() + "Km");
        System.out.println("Valor Total da Viagem: R$" + v1.getValorViagem() );
    }
}
