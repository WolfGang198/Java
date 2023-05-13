
package view;

public class Carreta {
    private String cor;
    private String modeloCarreta;
    
    Carreta(){
        
    }

    Carreta(String model) {
        modeloCarreta = model;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getModeloCarreta() {
        return modeloCarreta;
    }

    public void setModeloCarreta(String modeloCarreta) {
        this.modeloCarreta = modeloCarreta;
    }    
}
