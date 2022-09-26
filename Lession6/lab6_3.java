package Lession6;

import java.util.Arrays;
import java.util.Scanner;

public class lab6_3 {
    public static void main(String[] args) {
        System.out.println("Please input the char: ");
        Scanner scanner = new Scanner(System.in);
        String myStr = scanner.nextLine();
        char[] charArr = myStr.toCharArray();
        String newMyStr = "";
        for (char value :charArr) {
            if (Character.isDigit(value))
            {
                String digit = String.valueOf(value);
                newMyStr = newMyStr + digit;
            }
        }
        if (newMyStr =="")
            System.out.println("No any the digit in the string ");
        else
        System.out.println("Output the digit without the char is: "+ newMyStr);

    }
    }
