package lession10;
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
        Animal winner = animalList.get(0);

        for (Animal animals : animalList) {
                if (animals.getSpeed() > winner.getSpeed()) {
                    winner = animals;
            }
            System.out.println(animals.getName() +" : "+ animals.getSpeed());
        }
        System.out.println("Winner is: "+winner.getName()+(" with ") + winner.getSpeed() + " km/h");
    }
}
