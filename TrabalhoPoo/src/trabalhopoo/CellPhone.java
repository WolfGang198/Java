
package trabalhopoo;

public class CellPhone {
    String modelo;
    String cor;
    int memoria;
    int carga;
    boolean carregado;

    void status(){
        System.out.println("Model: " + this.modelo);
        System.out.println("Color: " + this.cor);
        System.out.println("Memory: " + this.memoria + " gb");
        System.out.println("Charge: " + this.carga + "%");
        System.out.println("Is it loaded? " + this.carregado);
    }
    
    void ligar(){
        if(this.carregado == false){
            System.out.println("ERROR! pleace, connect to charger");
        }
        else{
            System.out.println("making call");
        }
    }
    
    void carregar(){
        this.carregado = true;
    }
    
    void descarregar(){
        this.carregado = false;
    }    
}
