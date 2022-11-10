
package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        int n, s=0, p=0, i=0, m=0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um Numero: <br><em>(valor 0 interrompe)</em></html>"));
            s += n;
            if(n % 2 != 0){
                p++;
            }
            else{
               i++; 
            }
            if(n > 100){
                m++;
            }
        }while(n != 0);
        p--;
        JOptionPane.showMessageDialog(null, "<html>resultado: " + "<br>__________________" + "<br>" + "<br>Total dos Valores: " + s + "<br>Total de Pares: " + p + "<br>Total de Impares: " + i + "<br>Acima de 100: " + m + "</html>");
    }
    
}
