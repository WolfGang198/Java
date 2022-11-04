package model;

public class Manager extends Employee{
    
    public Manager() {
        super("Gerente");
    }
    
    @Override 
    public double calculateSalary() {
        return 10000;
    }

}
