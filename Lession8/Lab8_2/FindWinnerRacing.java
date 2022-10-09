package Lession8.Lab8_2;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindWinnerRacing {
    static Scanner scanner = new Scanner(System.in);
    static List<String> animalType = new ArrayList<>();
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal tiger = new Tiger();
        Animal horse = new Horse();
        int randomSpeedDog = new SecureRandom().nextInt(dog.getSpeed());
        int randomSpeedHorse = new SecureRandom().nextInt(horse.getSpeed());
        int randomSpeedTiger = new SecureRandom().nextInt(tiger.getSpeed());
        addAnimalType(animalType);
        String dogtype = "dog";
        String tigertype = "tiger";
        String horsetype = "horse";
        int dogSpeed = 0;
        int horseSpeed = 0;
        int tigerSpeed = 0;
        for (String value : animalType) {
            dogSpeed = randomSpeedDog;
            horseSpeed = randomSpeedHorse;
            tigerSpeed = randomSpeedTiger;
            if (value.equals(dogtype))
                System.out.println("speed dog is  " + dogSpeed);
            if (value.equals(horsetype))
                System.out.println("speed horse is  " + horseSpeed);
            if (value.equals(tigertype))
                System.out.println("speed tiger is  " + tigerSpeed);
        }
        int winner = 0;
        if (dogSpeed > horseSpeed) {
            winner = dogSpeed;
            animalType = Collections.singletonList("dog");
        } else {
            winner = horseSpeed;
            animalType = Collections.singletonList("horse");
        }
        if (winner < tigerSpeed) {
            winner = tigerSpeed;
            animalType = Collections.singletonList("tiger");
        }
        System.out.println("Winer is: " +animalType+ "+ speed: " +winner+"km/h");
    }
    public static void addAnimalType(List<String> animalType) {
        System.out.printf("Enter number of animal: ");
        int size = scanner.nextInt();
        if (size == 0) {
            System.out.println("List is empty!");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.printf("Enter animal  "+ i + " of list: ");
                animalType.add(scanner.next());
            }
        }
        for (String value : animalType) {
            System.out.print(value + ",");
        }
    }
}
