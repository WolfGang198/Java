
package model;

public class IPI implements Tax{
    private double ALIQUOT = 0.2475;

    
    @Override
    public double calculateTax(double value){
        return ALIQUOT * value;
    }
    
}
