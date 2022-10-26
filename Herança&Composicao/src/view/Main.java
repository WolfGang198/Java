
package view;


import java.util.ArrayList;
import model.MinhaListaDeString;
import model.MinhaListaDeStringComposta;

public class Main {
    public static void main(String[] args){
        MinhaListaDeString mls = new MinhaListaDeString();
        
        mls.add("ola");
        mls.add("Mundo");
        mls.add("!");
        
        for(String string : mls.getList()){
            System.out.println(string);
        }
        
        MinhaListaDeStringComposta mlsc = new MinhaListaDeStringComposta(new ArrayList<>());
        
        mlsc.add("ola");
        mlsc.add("Mundo");
        mlsc.add("!");
        
        for(String string : mlsc.getList()){
            System.out.println(string);
        }    
    }
    
}
