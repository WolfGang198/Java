package model;

public class Leader extends Employee {

    public Leader() {
        super("Líder Técnico");
    }

    @Override 
    public double calculateSalary() {
        return 9000;
    }
}
