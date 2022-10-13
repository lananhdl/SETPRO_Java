package lession10;
public class Horse extends Animal {

    int maxSpeed = 75;
    String name = "HORSE";

    @Override
    public int getSpeed() {
        return super.getAnimalSpeed(maxSpeed);
    }
    @Override
    public String getName(){
        return this.name;
    }
}
