package Lession5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>();
        boolean isContinue = true;
        while (isContinue) {
            printMenu();
            int option = getOption();
            switch (option) {
                case 0:
                    isContinue = false;
                    System.out.println("Bye bye");
                    break;
                case 1:
                    addNumList(integerArrayList);
                    break;
                case 2:
                    printNumbers(integerArrayList);
                    break;
                case 3:
                    findMax(integerArrayList);
                    break;
                case 4:
                    findMin(integerArrayList);
                    break;
                case 5:
                    searchNum(integerArrayList);
                    break;
                default:
                    System.out.println("Please enter the number from 0 to 5");
            }
        }
    }
    public static void printMenu() {
        System.out.println("MENU");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number");
        System.out.println("0. Exit");
    }

    public static int getOption() {
        System.out.print("Please enter a number in the menu: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void addNumList(List<Integer> integerArrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter list length: ");
        int size = scanner.nextInt();
        if (size == 0) {
            System.out.println("List is empty!");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.printf("Enter element "+ i + " of list: ");
                integerArrayList.add(scanner.nextInt());
            }
        }
        printNumbers(integerArrayList);
        System.out.println("\n ");
    }

    public static void checkEmpty(List<Integer> integerArrayList) {
        if (integerArrayList.isEmpty()) {
            System.out.println("List is empty, Please enter list ");
            addNumList(integerArrayList);
        }
        System.out.println("\n ");
    }

    public static void printNumbers(List<Integer> integerArrayList) {
        checkEmpty(integerArrayList);
        System.out.print("The values of list: ");
        for (Integer value : integerArrayList) {
            System.out.print(value + ",");
        }
        System.out.println("\n ");
    }

    public static void findMax(List<Integer> integerArrayList) {
        checkEmpty(integerArrayList);
        int max = integerArrayList.get(0);
        for (int i = 0; i < integerArrayList.size(); i++) {
            if (max < integerArrayList.get(i)) {
                max = integerArrayList.get(i);
            }
        }
        System.out.print("Max number in the list is " + max);
        System.out.println("\n ");
    }

    public static void findMin(List<Integer> integerArrayList) {
        checkEmpty(integerArrayList);
        int min = integerArrayList.get(0);
        for (int i = 0; i < integerArrayList.size(); i++) {
            if (min > integerArrayList.get(i)) {
                min = integerArrayList.get(i);
            }
        }
        System.out.print("Min number in the list is " + min);
        System.out.println("\n ");
    }

    public static void searchNum(List<Integer> integerArrayList) {
        checkEmpty(integerArrayList);
        List<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int num = scanner.nextInt();
        for (int i = 0; i < integerArrayList.size(); i++) {
            if (num == integerArrayList.get(i)) {
                arrayList.add(i);
            }
        }
        if (arrayList.isEmpty()) {
            System.out.println("The " + num + "is not in the list");
        } else {
            System.out.print("The index of  number " + num + " is: ");
            for (Integer value : arrayList) {
                System.out.print(value + " ");
            }
        }
        System.out.println("\n ");
    }
}
