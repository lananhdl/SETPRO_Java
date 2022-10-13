package lession10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        new AnimalTest().animalWinner(Arrays.asList(dog, tiger, horse));
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

