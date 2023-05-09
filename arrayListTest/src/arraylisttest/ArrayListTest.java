
package arraylisttest;
import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> minhaLista = new ArrayList<>();
        minhaLista.add(1, "A");
        minhaLista.add(2, "B");
        minhaLista.add(3, "C"); //adicionar
        
        String elemento = minhaLista.get(2); //acessar
        System.out.println(elemento);
    }
    
}
