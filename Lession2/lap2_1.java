package Lession2;
import java.util.Scanner;
public class lap2_1 {
    public static Scanner scanner = new Scanner(System.in);
    public static double  calculateBMI(double  weight, double  height)
    {
        double  bmi = (float) (weight / ((height* 2)));
        return bmi;
    }

    public static void main(String[] args) {
        final float     NORMAL_WEIGHT_MIN = 18.5f,
                NORMAL_WEIGHT_MAX = 24.9f,
                OVER_WEIGHT_MIN = 25.0f,
                OVER_WEIGHT_MAX = 29.9f,
                OBESITY = 30;
        System.out.print("Please enter weight: ");
        double  weight = scanner.nextDouble();
        System.out.print("Please enter height: ");
        double  height = scanner.nextDouble();
        System.out.print("BMI is ");
        System.out.print( calculateBMI(weight,height));

        if (calculateBMI(weight, height)< NORMAL_WEIGHT_MIN){
            System.out.printf(" and  is Underweight \t");
        }else if((calculateBMI(weight, height)< NORMAL_WEIGHT_MIN) & ((calculateBMI(height, weight)> NORMAL_WEIGHT_MAX))){
            System.out.printf(" and is Normal weight \t");
        }
        else if((calculateBMI(weight, height)< OVER_WEIGHT_MIN) & ((calculateBMI(height, weight)> OVER_WEIGHT_MAX))){
            System.out.printf(" and is Overweight  \t");
        }
        else if((calculateBMI(weight, height)> OBESITY))
        {System.out.printf(" and is Obesity  \t");}
    }
}


