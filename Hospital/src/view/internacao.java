
package view;

public class internacao {
    private int idInternacao;
    private String motivo;
    private float valorDia;
    private int totalDias;
    private float total;
    private int internacoes;
    
    public void internacao(){
        idInternacao = 1;
        motivo = "Virose";
        valorDia = 35f;
        totalDias = 30;
        internacoes = 15;
        
        System.out.println("Identificador de Internacao: " + idInternacao);
        System.out.println("Motivo: " + motivo + " || Valor por Dia: R$" + valorDia);
        total = valorDia * totalDias;
        System.out.println("Dias Internado: " + totalDias + " dias || Valor total: R$" + total);
        System.out.println("Total de internacoes do paciente: " + internacoes);
    }
}
