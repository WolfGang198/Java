package financilsa;

public class Calc {
    private float all;
    private float all2;
    private float all3;
    
    void calc(){
        all = price*quantity;
    }
    void calc2(){
        all2 = all;
        all3 = all3 + all2;
    }
    void CalcStatus(){
        System.out.println("====================");
        System.out.println("==Sout Supermarket==");
        System.out.println("====================");
        System.out.println("total value: " + all + " U$");
        System.out.println("====================");
    }
}
