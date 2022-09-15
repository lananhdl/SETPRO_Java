package Lession3;

import java.util.Scanner;

public class lab3_3 {


    static Scanner scanner = new Scanner(System.in);
    private static void inputArray(int n){
        int[] arrayA= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input the " + i);
            arrayA[i]  =    scanner.nextInt();
        }

        sortArray(arrayA);
        outputArray(arrayA);
    }
    public static void outputArray(int [] intArr){
        for(int i=0; i<intArr.length;i++){
            System.out.print(intArr[i] + " , ");
        }
    }
    public static void  sortArray(int [] intArr){
        for(int i=0; i<intArr.length-1;i++){
            for (int j = i+1; j < intArr.length ; j++) {
                if (intArr[i]> intArr[j]){
                    int temp = intArr[i];
                    intArr[i]= intArr[j];
                    intArr[j]= temp;

                }
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Input n is integer is array length");
       int n= scanner.nextInt();
        inputArray(n);

    }

}
