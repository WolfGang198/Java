
package model;

public class ISS implements Tax {
    private ISSAliquot aliquot;
    
    public ISS(ISSAliquot aliquot){
        this.aliquot = aliquot;
        
    }
    
    @Override
    public double calculateTax(double value){
        return aliquot.getAliquot() * value;
    }
    
}
