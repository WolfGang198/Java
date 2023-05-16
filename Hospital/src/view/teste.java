
package view;

public class teste {
    
    paciente p1 = new paciente();
    medico m1 = new medico();
    enfermeiro e1 = new enfermeiro();
    internacao i1 = new internacao();
    
    public void vizualizaRelatorio(){
        p1.paciente();
        System.out.println("====================");
        m1.medico();
        System.out.println("====================");
        e1.enfermeiro();
        System.out.println("====================");
        i1.internacao();
        System.out.println("====================");
    }
}
