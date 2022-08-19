
package model;
 
public enum ICMSAliquot {
    SPRJ(0.12),
    SPDF(0.07);
    
    private final double aliquot; 
    
    private ICMSAliquot(double a){
        this.aliquot = a;
}
    
    public double getAliquot(){
        return aliquot;
    }
}
