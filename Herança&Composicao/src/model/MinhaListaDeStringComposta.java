
package model;

//baseado em compsição

import java.util.List;
import java.util.Map;

public class MinhaListaDeStringComposta {
    private List<String> minhaListaInterna;
    private Map<String, Integer> map;
    
    public MinhaListaDeStringComposta(List<String>List){
        this.minhaListaInterna = List;
    }
    
    public void add(String value){
        this.minhaListaInterna.add(value);
    }
    
    public List<String> getList(){
        return this.minhaListaInterna;
    }
}
