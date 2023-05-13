
package view;

public class Viagem {
    private String destino;
    private float valorKm;
    private float valorViagem;
    private int distancia;
    
    public void calculaViagem(){
        valorViagem = valorKm * distancia;
    }

    public float getValorKm() {
        return valorKm;
    }

    public int getDistancia() {
        return distancia;
    }

    public float getValorViagem() {
        return valorViagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setValorKm(float valorKm) {
        this.valorKm = valorKm;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setValorViagem(float valorViagem) {
        this.valorViagem = valorViagem;
    }
    
    
}
