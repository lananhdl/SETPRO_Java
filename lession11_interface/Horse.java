package lession11_interface;

public class Horse extends Animal implements MoveAble, FlyAble {
    int maxSpeed = 75;
    String name = "HORSE";
    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public int Speed() {
        return super.getAnimalSpeed(maxSpeed);
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public boolean moveAble() {
        return true;
    }

}
