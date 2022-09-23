
package avaliacaolpiii1;

public class AvaliacaoLPIII1 {

    public static void main(String[] args) {
        
        Account a1 = new Account();
        a1.setName("Laura Guedes");
        a1.setBalance(1000.00f);
        a1.setMonths(6);
        a1.checkingAccount();
        System.out.println("");
        
        Account a2 = new Account();
        a2.setName("Caio Lima");
        a2.setBalance(2000.00f);
        a2.setMonths(2);
        a2.savingsAccount();
        System.out.println("");
        
        Account a3 = new Account();
        a3.setName("Amanda Mendes");
        a3.setBalance(5000.00f);
        a3.setMonths(6);
        a3.jointAccount();
        System.out.println("");
        
        Account a4 = new Account();
        a4.setName("Rafael Marques");
        a4.setBalance(10000.00f);
        a4.setMonths(12);
        a4.companyAccount();
        
    }
    
}
