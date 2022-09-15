package Lession3;

import java.util.Scanner;

public class lab3_2 {


    static Scanner scanner = new Scanner(System.in);
    private static void inputArray(int n){
        int[] arrayA= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input the " + i);
            arrayA[i]  =    scanner.nextInt();
        }
          outputArray(arrayA);
        checkMinMax(arrayA);
    }
    public static void outputArray(int [] intArr){
        for(int i=0; i<intArr.length;i++){
            System.out.print(intArr[i] + " , ");
        }
    }

    public static void checkMinMax(int[] intArr){
        int   min= intArr[0], max= intArr[0];
        for (int value:intArr) {
            if(value<min)
                min=value;
            if (value>max)
                max=value;
        }
        System.out.println("min is " + min);
        System.out.println("max is " + max);
    }

    public static void main(String[] args) {
        System.out.println("Input n is integer is array length");
       int n= scanner.nextInt();
        inputArray(n);

    }

}
