package Lession8_1.Lab8_1;

public class Employee {
    protected String employeeType;
    protected int salary;

    public Employee() {

    }

    public Employee(String employeeType, int salary) {
        this.employeeType = employeeType;
        this.salary = salary;
    }


    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeType='" + employeeType + '\'' +
                ", salary=" + salary +
                '}';
    }
}
