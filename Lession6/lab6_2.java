package Lession6;

import java.util.Scanner;

public class lab6_2 {
    public static void main(String[] args) {
        String thePass = "password123";
        int isContinuing = 0;
        while (isContinuing < 3){
            System.out.println("Input the password: ");
            Scanner scanner = new Scanner(System.in);
            String inputPassword = scanner.nextLine();
            if (!inputPassword.equals(thePass))
            {
                System.out.println("Password is wrong, please input again");
                isContinuing++;
            } else
            {
                System.out.println("The password is correct you can go to next step");
                break;
            }

        }
        if (isContinuing == 3) {
            System.out.println("Wrong password 3 times");
        }

    }
}
