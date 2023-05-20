
package view;

public class medico {
    private String nomeMedico;
    
    public void medico(){
        System.out.println("Nome do(a) Medico(a): " + nomeMedico);
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }
}
