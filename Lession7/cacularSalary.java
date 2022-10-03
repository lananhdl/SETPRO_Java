package Lession7;

import java.util.*;

public class cacularSalary {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        employee fte = new fte();
        employee contract = new contractEmployee();
        System.out.print("Input the number of employee: ");
        int n = scanner.nextInt();
        System.out.print("Please enter the number of FTE: ");
        int fteNumber = scanner.nextInt();
        if(fteNumber>n){
            System.out.print("Please reenter the number of FTE  (must less than) "+ n + ":  ");
            fteNumber = scanner.nextInt();
        }
        System.out.println("The number of Contract employee are : "+ (n-fteNumber));
        int fteSalary=fteNumber* fte.getSalary();
        int contractSalary =(n-fteNumber) * contract.getSalary();
        int totalSalary = fteSalary + contractSalary;
        System.out.println("The total salary = "+ totalSalary );
          }

}