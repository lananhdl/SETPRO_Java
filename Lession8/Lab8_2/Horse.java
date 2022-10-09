package Lession8.Lab8_2;

public class Horse extends Animal{
    private static int HORSE_MAX_SPEED = 75;

    @Override
    public int getSpeed() {
        return HORSE_MAX_SPEED;
    }

}
