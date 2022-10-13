package lession10;
public class Dog extends Animal {

    int maxSpeed = 60;
    String name = "DOG";

    @Override
    public int getSpeed() {
        return super.getAnimalSpeed(maxSpeed);
    }
    @Override
    public String getName(){
        return this.name;
    }
}
