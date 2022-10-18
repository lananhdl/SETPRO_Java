package lession11_interface;

import java.security.SecureRandom;

public abstract class Animal implements MoveAble,FlyAble {
    private String name;
    private int speed;
    private boolean fly;

    public Animal() {
    }

    public Animal(String name, int speed, boolean fly) {
        this.name = name;
        this.speed = speed;
        this.fly = fly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }
    public int getSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }
    @Override
    public boolean moveAble() {
        return true;
    }


}
