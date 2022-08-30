
package trabalhopoo;

public class TrabalhoPoo {

    public static void main(String[] args) {
        CellPhone a1 = new CellPhone();
        a1.modelo = "WG venom";
        a1.cor = "Preto";
        a1.memoria = 128;
        a1.carga = 87;
        a1.carregar();
        a1.status();
        a1.ligar();
        
        CellPhone a2 = new CellPhone();
        a2.modelo = "WG azure";
        a2.cor = "Vermelho";
        a2.memoria = 64;
        a2.carga = 0;
        a2.descarregar();
        a2.status();
        a2.ligar();
    }
    
}
