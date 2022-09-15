package Lession3;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class lab3_1 {
    static Scanner scanner = new Scanner(System.in);
    public static void inputArray(int n){
int[] intArr = new int[n];
for (int i=0; i<n; i++){
    System.out.print("Input the ");
    System.out.println(i);
    intArr[i] =scanner.nextInt();
        }
System.out.print(" The array is ");
                outputArray(intArr);
                checkEvenNumberArray(intArr);
    }
    public static void outputArray(int [] intArr){
        for(int i=0; i<intArr.length;i++){
            System.out.print(intArr[i] + " , ");
        }
    }

    public static void checkEvenNumberArray(int [] intArr){
        int evenNumber =0,oldNumber =0;

        for(int i=0; i<intArr.length;i++){
            if (isEvenNumber(intArr[i]))
                evenNumber++;
            else  oldNumber++;
        }
        System.out.println("Number of even number is "+ evenNumber );
        System.out.println("Number of old number is "+ oldNumber );
    }
    public static boolean isEvenNumber(int n)
    {
        if (n % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Input the arrayLenght: ");
       int n= scanner.nextInt();
        inputArray(n);

    }
}
