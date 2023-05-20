
package view;

public class internacao {
    private int idInternacao;
    private String motivo;
    private float valorDia;
    private int totalDias;
    private float total;
    private int internacoes;
    
    public void internacao(){
        
        System.out.println("Identificador de Internacao: " + idInternacao);
        System.out.println("Motivo: " + motivo + " || Valor por Dia: R$" + valorDia);
        total = valorDia * totalDias;
        System.out.println("Dias Internado: " + totalDias + " dias || Valor total: R$" + total);
        System.out.println("Total de internacoes do paciente: " + internacoes);
    }

    public void setIdInternacao(int idInternacao) {
        this.idInternacao = idInternacao;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setValorDia(float valorDia) {
        this.valorDia = valorDia;
    }

    public void setTotalDias(int totalDias) {
        this.totalDias = totalDias;
    }

    public void setInternacoes(int internacoes) {
        this.internacoes = internacoes;
    }

    public int getIdInternacao() {
        return idInternacao;
    }

    public String getMotivo() {
        return motivo;
    }

    public float getValorDia() {
        return valorDia;
    }

    public int getTotalDias() {
        return totalDias;
    }

    public int getInternacoes() {
        return internacoes;
    }
    
    
}
