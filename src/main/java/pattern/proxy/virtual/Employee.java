package pattern.proxy.virtual;

/**
 * Created by Jack on Feb 9:58 PM, 2019
 **/
public class Employee {
    private String employeeName;
    private double employeeSalary;
    private String employeeDesignation;

    public Employee(String employeeName, double employeeSalary, String employeeDesignation){
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public double getEmployeeSalary(){
        return employeeSalary;
    }

    public String getEmployeeDesignation(){
        return getEmployeeDesignation();
    }

    public String toString(){
        return "Employee Name: "+ employeeName +", EmployeeDesignation:" + employeeDesignation
                + " ,Employee Salary:" + employeeSalary;
    }
}
