
package classeabstrata;

import view.Gato;
import view.Cachorro;


public class ClasseAbstrata {

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Luke");
        Gato g1 = new Gato("Kuro");
        
        c1.fazerBarulho();
        g1.fazerBarulho();
    }
    
}
