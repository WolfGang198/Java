
package model;

public class finalPrice {
    //Estratégia de cálculo
    private Tax tax;
    
    public void setStrategy(Tax tax){
        this.tax = tax;
    }
    
    public double calculateFinalPrice(double value, double profit){
        double finalProfit = value * profit;
        return value + tax.calculateTax(value) + finalProfit;
    } 
}
