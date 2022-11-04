package model;

public class Programer extends Employee {
    public Programer() {
        super("Programador");
    }
    @Override 
    public double calculateSalary() {
        return 8000;
    }
}
