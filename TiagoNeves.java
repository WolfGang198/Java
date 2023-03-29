
package view;

import Class.Cliente;
import Class.Custo;
import Class.Motorista;
import Class.Onibus;
import Class.Viagem;

public class TiagoNeves {

    public static void main(String[] args) {
        
        System.out.println("====RELATORIO====");
        System.out.println("");
        
        Cliente c1 = new Cliente();    
        System.out.print("Cliente: ");
        System.out.println(c1.getNomeCliente());
        System.out.print("Viagens feitas: ");
        System.out.println(c1.getTotalViagens());
        System.out.println("-----------------");
        
        Motorista m1 = new Motorista();
        System.out.print("Motorista: ");
        System.out.println(m1.getNomeMotorista());
        System.out.println("-----------------");

        Onibus o1 = new Onibus();
        System.out.print("Modelo: ");
        System.out.println(o1.getModelo());
        System.out.println("-----------------");
        
        Viagem v1 = new Viagem();
        System.out.print("Numero: ");
        System.out.println(v1.getNumeroViagem());
        System.out.print("Destino: ");
        System.out.println(v1.getDestino());
        System.out.print("Distancia: ");
        System.out.print(v1.getDistancia());
        System.out.println("Km");
        System.out.println("-----------------");
        
        Custo ct1 = new Custo();
        System.out.print("Preço por km: R$");
        System.out.println(ct1.getPreçoKm());
        System.out.print("Valor total: R$");
        System.out.println(ct1.getTotal());
        System.out.println("-----------------");
    }
    
}
