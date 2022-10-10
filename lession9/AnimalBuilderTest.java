package lession9;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static lession9.AnimalBuider.Builder;

public class AnimalBuilderTest {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> animalList = new ArrayList<>();
    static ArrayList<Integer> animalSpeedList = new ArrayList<>();
    static ArrayList<Boolean> animalFyList = new ArrayList<>();
    public static void main(String[] args) {
        Builder builder = new Builder();
        System.out.printf("Enter number of animal: ");
        int size = scanner.nextInt();
        if (size == 0) {
            System.out.println("List is empty!");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.printf("Enter name and speeds animal  " + i + " of list: ");
                builder.setName(scanner.next())
                        .setSpeeds(scanner.nextInt())
                        .setFlyable(getRandomBoolean());
                AnimalBuider animal = builder.build();
                System.out.println("animal: " + animal.getName() + " " + animal.getSpeeds() + " " + animal.getFlyable());
                if (animal.getFlyable() == true) {
                    animalList.add(animal.getName());
                    animalSpeedList.add(animal.getSpeeds());
                }
            }
            if (animalSpeedList.size() == 0) {
                System.out.println("No any animal can fly");
            } else {
                int maxValue = 0;
                int index = 0;
                int indexAnimal=0;
                for (int valueSpeed : animalSpeedList
                ) {

                    if (valueSpeed > maxValue) {
                        maxValue = valueSpeed;
                        index++;
                    }

                }
                for (String winner:animalList
                     ) {  indexAnimal++;
                    if(indexAnimal==index){
                        System.out.println("Winner is: "+ winner +" with speed is: "+ maxValue );
                    }

                }

            }
        }
    }



    public static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

}

