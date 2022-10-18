package lession11_interface;


import lession10.AnimalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalControl {
    public static void main(String[] args) {
       Animal dog = new Dog(),
         horse = new Horse(),
         tiger = new Tiger();
        List<MoveAble> animalWinner = Arrays.asList(dog, horse, tiger);
        List<FlyAble> flyAbles = new ArrayList<>();
    }



    public void animalWinner(List<Animal> animalList) {
        ArrayList<Integer> animalSpeedList = new ArrayList<>();
        ArrayList<String> animalNameList = new ArrayList<>();
        Animal winner = animalList.get(0);
        for (Animal animals : animalList) {
            String name= animals.getName();
            int speed= animals.getSpeed();
            animalSpeedList.add(speed);
            animalNameList.add(name);
            System.out.println(name + " : "+ speed);
        }
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
        for (String winnerName:animalNameList
        ) {  indexAnimal++;
            if(indexAnimal==index){
                System.out.println("Winner is: "+ winnerName +" with speed is: "+ maxValue );
            }

        }

    }
}
