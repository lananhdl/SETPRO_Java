package Lession2;
import java.util.Scanner;
public class lap2_2 {
   public static Scanner scanner = new Scanner(System.in);
   public static boolean isEvenNumber(int n)
   {
      if (n % 2 == 0){
         return true;
      }
      return false;
   }

   public static void main(String[] args) {
      System.out.print("Please enter a any value is integer: ");
      int n = scanner.nextInt();
      if (isEvenNumber(n)){
         System.out.printf("%d is an even number\t", n);
      }else{
         System.out.printf("%d is odd number\t", n);
      }
   }
}
