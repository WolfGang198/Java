
package retangulo;

public class RetanguloMain {

    public static void main(String[] args) {
        RetanguloTest teste = new RetanguloTest();
        boolean resultado;
        
        resultado = teste.testCalcularArea();
        System.out.println("testcalculararea: " + resultado);
        
        resultado = teste.testCalcularPerimetro();
        System.out.println("testcalcularperimetro: " + resultado);
        
    }
    
}
