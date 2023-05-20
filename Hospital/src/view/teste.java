
package view;

import java.util.ArrayList;
import java.util.Scanner;

public class teste {
    int c1;   
    int c2;
    paciente p1 = new paciente();
    medico m1 = new medico();
    enfermeiro e1 = new enfermeiro();
    internacao i1 = new internacao();
    
    Scanner s1 = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);
    Scanner s3 = new Scanner(System.in);
    Scanner s4 = new Scanner(System.in);
    Scanner s5 = new Scanner(System.in);
    Scanner s6 = new Scanner(System.in);
    Scanner s7 = new Scanner(System.in);
    Scanner s8 = new Scanner(System.in);
    
    
    public void vizualizaRelatorio(){
        
        ArrayList<String> medico = new ArrayList<>();
        ArrayList<String> enfermeiro = new ArrayList<>();
        ArrayList<String> idInternacao = new ArrayList<>();
        ArrayList<String> motivo = new ArrayList<>();
        ArrayList<Float> ValorDia = new ArrayList<>();
        ArrayList<String> totalDia = new ArrayList<>();
        ArrayList<String> internacoes = new ArrayList<>();
        
        System.out.print("Nome do(a) Passiente: ");
        p1.setNomePaciente(s1.nextLine());
        
        do{
            System.out.print("Nome do(a) medico(a): ");
            m1.setNomeMedico(s1.nextLine());
            medico.add(m1.getNomeMedico());
            System.out.print("Nome do(a) enfremeiro(a): ");
            e1.setNomeEnfermeiro(s2.nextLine());
            enfermeiro.add(e1.getNomeEnfermeiro());
            System.out.print("Identificador de Internação: ");
            i1.setIdInternacao(s3.nextInt());
            idInternacao.add(Integer.toString(i1.getIdInternacao()));
            System.out.print("Motivo da internacao: ");
            i1.setMotivo(s4.nextLine());
            motivo.add(i1.getMotivo());
            System.out.print("Valor por dia: R$");
            i1.setValorDia(s5.nextFloat());
            ValorDia.add(i1.getValorDia());
            System.out.print("Dias Internado: ");
            i1.setTotalDias(s6.nextInt());
            totalDia.add(Integer.toString(i1.getTotalDias()));
            System.out.print("Total de Internacoes do Passiente: ");
            i1.setInternacoes(s7.nextInt());
            internacoes.add(Integer.toString(i1.getInternacoes()));
            System.out.println("Deseja Continuar? [1]-Sim <> [0]-Não");
            this.c1 = s8.nextInt();
            c2 = c2 + 1;
            
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            
        }while(c1 != 0);
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        
        
        for(int i = 0; i < c2; i++){
            m1.setNomeMedico(medico.get(i));
            e1.setNomeEnfermeiro(enfermeiro.get(i));
            i1.setIdInternacao(Integer.parseInt(idInternacao.get(i)));
            i1.setMotivo(motivo.get(i));
            i1.setValorDia(Math.round(ValorDia.get(i)));
            i1.setTotalDias(Integer.parseInt(totalDia.get(i)));
            i1.setInternacoes(Integer.parseInt(internacoes.get(i)));
            
            
            p1.paciente();
            System.out.println("====================");
            m1.medico();
            System.out.println("====================");
            e1.enfermeiro();
            System.out.println("====================");
            i1.internacao();
            System.out.println("====================");
            System.out.println("\n");
        }
    }
}
