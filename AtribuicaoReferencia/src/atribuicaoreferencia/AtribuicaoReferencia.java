
package atribuicaoreferencia;

public class AtribuicaoReferencia {

    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;
        System.out.println("intA = " + intA + " intB = " + intB);
        intA = 2;
        System.out.println("intA = " + intA + " intB = " + intB);
    }
    
}