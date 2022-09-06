package financialsa;

public class FinancialSa {

    public static void main(String[] args) {
        ProductList p1 = new ProductList();
        p1.product="Pizza";
        p1.setPrice(10.75f);
        p1.setQuantity(2);
        p1.id=1;
        p1.status();
        
        Calc c1 = new Calc();
        c1.CalcStatus();
    }
}
