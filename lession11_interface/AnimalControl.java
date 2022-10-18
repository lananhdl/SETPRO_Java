package lession11_interface;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalControl {
    public static void main(String[] args) {
       Animal dog = new Dog(),
         horse = new Horse(),
         tiger = new Tiger();
        new AnimalControl().animalWinner(Arrays.asList(dog,horse,tiger));
    }
    public void animalWinner(List<lession10.Animal> animalList) {
        ArrayList<Integer> animalSpeedList = new ArrayList<>();
        ArrayList<String> animalNameList = new ArrayList<>();
        lession10.Animal winner = animalList.get(0);
        for (lession10.Animal animals : animalList) {
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
