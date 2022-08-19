
package model;

public class ICMS implements Tax{
    private ICMSAliquot aliquot;
    private double value;
    
    public ICMS(ICMSAliquot aliquot){
        this.aliquot = aliquot;
    }
    
    @Override
    public double calculateTax(double value){
        return aliquot.getAliquot() * value;
    }
}
