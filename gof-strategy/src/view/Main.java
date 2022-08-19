
package view;

import model.finalPrice;
import model.IPI;
import model.ISS;
import model.ISSAliquot;
import model.Tax;

public class Main {
    public static void main(String[] args){
        //Estratégia inicial como IPI
        Tax strategy = new IPI();
        
        finalPrice fp = new finalPrice();
        fp.setStrategy(strategy);
        
        double finalPrice = fp.calculateFinalPrice(100000, 0.1);
        
        
        System.out.printf("Preço final com IPI: %.2f\n", finalPrice);
        
        
        //Estratégia alterada para ISS
        strategy = new ISS(ISSAliquot.MACHADO);
        fp.setStrategy(strategy);
        finalPrice = fp.calculateFinalPrice(1000, 0.3);
        System.out.printf("Preço final com ISS: %.2f", finalPrice);
    }
    
}
