
package view;

public class enfermeiro {
    private String nomeEnfermeiro;
    
    public void enfermeiro(){
        System.out.println("Nome do(a) Enfermeiro(a): " + nomeEnfermeiro);
    }

    public void setNomeEnfermeiro(String nomeEnfermeiro) {
        this.nomeEnfermeiro = nomeEnfermeiro;
    }

    public String getNomeEnfermeiro() {
        return nomeEnfermeiro;
    }
}
