package lession11_access_modifier;

public class Dog  extends  Animal{
  // Sinh ra cần phải có speed ngay
    public Dog(int speed){
        super(speed); // bên trong supper này phải có supper đưa vô -> tạo constructure bên Anumak (co doi so va k co doi so)
    }
    public void setSpeed(int speed){
        this.speed= speed; // con chó này có khả năng thay đổi tốc độ bằng cách change speed đó  this.speed= speed;
    }
    public int getSpeed(){
        return this.speed; //get cái current speed
    }

    // k đc lower access modifier khi overrider (Kế thừa) từ cha
    // tức k đ như này
    /*private String addAnimPrefix(){
        return "my name is, " + this.name;
    }*/
    // mà phải như này
    @Override
     public String addAnimPrefix(){
        return "my name is, " + this.name;
    }
}
