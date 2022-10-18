package lession11_access_modifier;

public class Animal {
     String name;
     int speed;
public Animal(){

}
    public Animal(int speed) {
        this.speed = speed;
    }

    //Support method (private) -> bên ngoài dù con cũng k sd đc, chỉ sử dụng trong cùng class
      String addAnimPrefix(){
        return "my name is, " + this.name;
    }
    // service method -> nnhw public
   // default , protected -> tức inhertance method -> Chỉ cho con cua no dung ma thoi ,  cùng package dùng

}
