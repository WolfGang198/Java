
package view;

import java.util.ArrayList;

public class Cliente {
    private String nome;
     
     
     
    public Viagem v1 = new Viagem();
    public Caminhoneiro cm1 = new Caminhoneiro();
    public Carreta c1 = new Carreta();
    
    public Cliente() {
        
    }

    
    public void visualizarViagem(){
        
        nome = "Rafael";
        
        ArrayList<String> motoristas = new ArrayList<>();
        motoristas.add("Jorge");
        motoristas.add("Luiz");
        motoristas.add("Antonio");
        
        ArrayList<String> modelo = new ArrayList<>();
        modelo.add("AJAX F-400");
        modelo.add("Saara Sand5");
        modelo.add("Panter 225");
        
        ArrayList<String> destino = new ArrayList<>();
        destino.add("Piracicaba");
        destino.add("Sao Tome das Letras");
        destino.add("Ribeirao Preto");
        
        ArrayList<Float> valorKm = new ArrayList<>();
        valorKm.add(6.30f);
        valorKm.add(4.20f);
        valorKm.add(5.75f);
        
        ArrayList<Float> distancia = new ArrayList<>();
        distancia.add(430f);
        distancia.add(150f);
        distancia.add(250f);
        
        int c = motoristas.size();
        
        System.out.println("Cliente: " + nome);
        for(int i = 0; i < c; i++){
        cm1.setNome(motoristas.get(i));
        c1.setModeloCarreta(modelo.get(i));
        v1.setDestino(destino.get(i));
        v1.setValorKm(valorKm.get(i));
        v1.setDistancia(distancia.get(i));
        v1.calculaViagem();
        System.out.println("==========================");
        System.out.println("Motorista: " + cm1.getNome());
        System.out.println("Veiculo: " + c1.getModeloCarreta());
        System.out.println("Destino: " + v1.getDestino());
        System.out.println("Valor Km: R$" + v1.getValorKm() + " Distancia: " + v1.getDistancia() + "Km");
        System.out.println("Valor Total da Viagem: R$" + v1.getValorViagem() );
        }
    }
}
