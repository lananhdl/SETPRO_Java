package lession11_interface;

// Provide ability for irrelevant objects/classes
public class Dog extends Animal implements MoveAble , FlyAble {
    int maxSpeed = 60;
    String name = "DOG";

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public int Speed() {
         return super.getAnimalSpeed(maxSpeed);
    };

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public boolean moveAble() {
        return true;
    }

}
