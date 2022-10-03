package Lession8_1;

public class employee {
    protected String employeeType;
    protected int salary;

    public employee() {

    }

    public employee(String employeeType, int salary) {
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
        return "employee{" +
                "employeeType='" + employeeType + '\'' +
                ", salary=" + salary +
                '}';
    }
}
