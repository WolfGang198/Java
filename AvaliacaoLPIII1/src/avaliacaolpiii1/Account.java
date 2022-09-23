
package avaliacaolpiii1;

public class Account {
    private String name;
    private float balance;
    private float fees;
    private float progesion;
    private float limit;
    private int months;
    private int user;
    private boolean withdraw;
    
    public void setProgesion(float p){
        this.progesion = p;
    }
    
    public float getProgesion(){
        return this.progesion;
    }
    public String getName(){
        return this.name;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public float getBalance(){
        return this.balance;
    }
    
    public void setBalance(float b){
        this.balance = b;
    }
    
    public float getFees(){
        return this.fees;
    }
    
    public void setFees(float f){
        this.fees = f;
    }
    
    public float getMonths(){
        return this.months;
    }
    
    public void setMonths(int m){
        this.months = m;
    }
    
    void checkingAccount(){
        fees = 1f;
        progesion = ((balance * fees)/ 100) + balance;
        withdraw = true;
        System.out.println("====================");
        System.out.println("  checking account  ");
        System.out.println("====================");
        System.out.println("name: " + this.name);
        System.out.println("balance: " + this.balance);
        System.out.println("months: " + this.months);
        System.out.println("progesion: " + this.progesion);
        System.out.println("====================");
        System.out.println("withdraw: " + this.withdraw);
        System.out.println("limit: no limit");
        System.out.println("to withdraw PRESS HERE");
        System.out.println("====================");
        
    }
    
    void savingsAccount(){
        fees = 0.7f;
        progesion = ((balance * fees)/ 100) + balance;
        if(balance > 0)
            withdraw = true;
        else
            withdraw = false;
        
        
        System.out.println("=====================");
        System.out.println("   savings account  ");
        System.out.println("=====================");
        System.out.println("name: " + this.name);
        System.out.println("balance: " + this.balance);
        System.out.println("months: " + this.months);
        System.out.println("progesion: " + this.progesion);
        System.out.println("=====================");
        System.out.println("withdraw: " + this.withdraw);
        System.out.println("limit: " + this.balance);
        System.out.println("to withdraw PRESS HERE");
        System.out.println("=====================");
    }
    
    void jointAccount(){
        fees = 1.2f;
        progesion = ((balance * fees)/ 100) + balance;
        user = 2;
        if(user == 1){
            withdraw = true;
            limit = balance;
        }
        if(user == 2){
            withdraw = true;
            limit = balance - 2000;
        }
        
        System.out.println("=====================");
        System.out.println("    joint account    ");
        System.out.println("=====================");
        System.out.println("name: " + this.name);
        System.out.println("balance: " + this.balance);
        System.out.println("months: " + this.months);
        System.out.println("progesion: " + this.progesion);
        System.out.println("=====================");
        System.out.println("withdraw: " + this.withdraw);
        System.out.println("limit: " + this.limit);
        System.out.println("to withdraw PRESS HERE");
        System.out.println("=====================");
        
    }
     void companyAccount(){
        fees = 2f;
        progesion = ((balance * fees)/ 100) + balance;
        if(balance > -1000)
            withdraw = true;
        else
            withdraw = false;
        
        System.out.println("=====================");
        System.out.println("   company account   ");
        System.out.println("=====================");
        System.out.println("name: " + this.name);
        System.out.println("balance: " + this.balance);
        System.out.println("months: " + this.months);
        System.out.println("progesion: " + this.progesion);
        System.out.println("=====================");
        System.out.println("withdraw: " + this.withdraw);
        System.out.println("limit: " + (this.balance + 1000));
        System.out.println("to withdraw PRESS HERE");
        System.out.println("=====================");
    }
}
