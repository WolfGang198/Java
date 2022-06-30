
package retangulo;

public class RetanguloTest {
    Retangulo retangulo;
    
    public boolean testCalcularArea(){
        retangulo = new Retangulo(10, 2);
        int resultadoEsperado = 20;
        
        int resultado = retangulo.calcularArea();
        
        if(resultado == resultadoEsperado){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean testCalcularPerimetro(){
        retangulo = new Retangulo(10, 2);
        int resultadoEsperado = 24;
        
        int resultado = retangulo.calcularPerimetro();
        
        if(resultado == resultadoEsperado){
            return true;
        }
        else{
            return false;
        }
    }
}
