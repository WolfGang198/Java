
package gerenciaestoque;

import java.io.IOException;
import java.util.Scanner;
import model.Produto;
import model.Fornecedor;
import model.Interface;
import model.Venda;

public class GerenciaEstoque {

    public static void main(String[] args) throws IOException, InterruptedException {
        Produto p1 = new Produto();
            
        Fornecedor f1 = new Fornecedor();   
        
        Venda v1 = new Venda();
        
        Interface i1 = new Interface();
        
        i1.Interface();
        
        Scanner ler = new Scanner(System.in);
        int n = -1;
        while(n != 0){
            n = ler.nextInt();    
            switch(n){
                case 1:
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    p1.cadStatus();
                break;
                case 2:
                    f1.cadStatus();
                break;
                case 3:
                    p1.cadProduto();
                break;
                case 4:
                    f1.cadFornecedor();
                break;
                case 5:
                    v1.totVenda();
                break;
                case 0:
               
                break;
            }
        }
    }
    
}
