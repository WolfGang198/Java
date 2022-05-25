
package projetono;

public class ProjetoNo {

     public static void main(String[] args)
     {
         String conteudo;
         
         No no1 = new No( conteudo = "conteudo no1");
         
         No no2 = new No( conteudo = "conteudo no2");
         no1.setProximoNo(no2);
         
         No no3 = new No( conteudo = "conteudo no3");
         no2.setProximoNo(no3);
         
         No no4 = new No( conteudo = "conteudo no4");
         no3.setProximoNo(no4);
         
         System.out.println(no1);
         System.out.println(no1.getProximoNo());
         System.out.println(no1.getProximoNo().getProximoNo());
         System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
     }
    
}
