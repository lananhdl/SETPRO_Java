package lession11_interface;

public interface MoveAble {
     static int speed(){
         return 0;
     }
    int Speed();
    default String getAnimalsName(){
        return getClass().getSimpleName();
    }
    boolean moveAble();
}
