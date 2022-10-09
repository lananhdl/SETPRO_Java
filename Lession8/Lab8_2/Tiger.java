package Lession8.Lab8_2;

public class Tiger extends Animal{
    private static int TIGER_MAX_SPEED = 100;

    @Override
    public int getSpeed() {
        return TIGER_MAX_SPEED;
    }
}
