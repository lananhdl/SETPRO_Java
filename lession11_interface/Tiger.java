package lession11_interface;

public class Tiger extends Animal implements MoveAble , FlyAble {
    int maxSpeed = 100;
    String name = "Tiger";

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public int Speed() {
        return super.getSpeed(maxSpeed);
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
