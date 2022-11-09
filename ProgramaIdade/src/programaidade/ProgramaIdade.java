package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Em que ano voce nasceu? ");
        int nasc = t.nextInt();
        int i = 2022 - nasc;
        System.out.println("Sua idade e " + i);
        if(i>=18){
            System.out.println("Maior de Idade"); 
        }
        else{
            System.out.println("Menor de Idade");
        }        
    }
    
}
