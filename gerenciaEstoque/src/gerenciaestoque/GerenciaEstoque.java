
package gerenciaestoque;

import java.util.Scanner;
import model.Produto;
import model.Fornecedor;
import model.Interface;
import model.Sair;
import model.Venda;

public class GerenciaEstoque {

    public static void main(String[] args) {
        Produto p1 = new Produto();
            
        Fornecedor f1 = new Fornecedor();   
        
        Venda v1 = new Venda();
        
        Interface i1 = new Interface();
        
        Sair s1 = new Sair();
        
        i1.Interface();
        
        Scanner ler = new Scanner(System.in);
        int n;
        do {
            n = ler.nextInt();    
            switch(n){
                case 1 -> p1.cadStatus();
                case 2 -> f1.cadStatus();
                case 3 -> p1.cadProduto();
                case 4 -> f1.cadFornecedor();
                case 5 -> v1.totVenda();
                case 6 -> i1.Interface();
                case 0 -> s1.Sair();
            }
        }while(n != 0);
    }
    
    }

