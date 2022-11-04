package model;

public class EmployeeFactory {
    public enum EMPLOYEE_TYPE{
        MANAGER,
        PROGRAMER,
        LEADER,
    }
    
    public static Employee createEmployee(EMPLOYEE_TYPE employeeType) {
        
        if(employeeType == EMPLOYEE_TYPE.MANAGER)
            return new Manager();
        if(employeeType == EMPLOYEE_TYPE.PROGRAMER)
            return new Programer();
        
        return new Leader();
    }
}
