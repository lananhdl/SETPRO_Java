package Lession8_1.Lab8_2;

public class Animal {
    protected int speed;
protected String animalType;
    public Animal(){

    }
    public Animal(int speed, String animalType) {
        this.speed = speed;
        this.animalType = animalType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                ", animalType='" + animalType + '\'' +
                '}';
    }
}
