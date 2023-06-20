
package view;

public class caracteristicas {
    private String tipo = "";
    private boolean jogador = true;
    
    public void explodir(){
        this.jogador = true;
        this.tipo = "rosa";
        
        if(jogador == true){
            if(tipo == "comum"){
              System.out.println("ZzzzZzzzZ... BBOOOMMM!!!!");  
            }
            else{
                if(tipo == "nuclear"){
                    System.out.println("Houston we have A GOT DAMIT problem...");
                }
                else{
                    if(tipo == "flamejante"){
                        System.out.println("FOOOGOOOOO!!!!");
                    }
                    else{
                        if(tipo == "gelado"){
                            System.out.println("ice... ice... ice everywere...");
                        }
                        else{
                            if(tipo == "aquatico"){
                                System.out.println("now your body is 93% water");
                            }
                            else{
                                if(tipo == "rosa"){
                                    System.out.println("OH MA GAhh thats soo beautifull thing...");
                                }
                            }
                        }
                    }
                }
            }
        }
        else{
            System.out.println("Nao explode...");
        }
    }
}
