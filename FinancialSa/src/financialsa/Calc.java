package financialsa;

public class Calc {
    private float all;
    private float all2;
    private float all3;
    
    ProductList pro;
    
    void calc(){
        all = pro.getPrice() * pro.getQuantity();
    }
    /*void calc2(){
        all2 = all;
        all3 = all3 + all2;
    }*/
    void CalcStatus(){
        System.out.println("====================");
        System.out.println("==Sout Supermarket==");
        System.out.println("====================");
        System.out.println("total value: " + this.all + " U$");
        System.out.println("====================");
    }
}
