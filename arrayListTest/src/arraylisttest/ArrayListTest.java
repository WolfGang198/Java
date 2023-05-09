
package arraylisttest;

import java.util.ArrayList;//importação

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> contatos = new ArrayList<>();//chamado
        contatos.add("Rafael");
        contatos.add("99400-9087");
        contatos.add("rafael_marques@furro.com");
        contatos.add("Jonas");
        contatos.add("99393-3547");
        contatos.add("jojorge@pirado.com");//adicionando elementos...
        
        System.out.println("Tamanho do Array: " + contatos.size());//verificando tamanho
        System.out.println(contatos);//mostrar tudo
        System.out.println("Email Rafael: " + contatos.get(2));//mostrar especifico
        System.out.println("===================");
        for(int i = 0; i < contatos.size(); i++){
            System.out.println(contatos.get(i));//percorrer array
        }
    }
    
}
