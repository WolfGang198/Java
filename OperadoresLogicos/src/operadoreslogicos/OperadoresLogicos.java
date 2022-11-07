
package operadoreslogicos;

public class OperadoresLogicos {

    public static void main(String[] args) {
        
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        
        
        //e
        r = x<y && y==z ? true : false;
        System.out.println(r);
        
        //ou
        r = x<y || y==z ? true : false;
        System.out.println(r);
        
        //ou exclusivo
        r = x<y ^ y<z ? true : false;
        System.out.println(r);
    }
    
}
