package lession11_polymorphism;

public class EchTest {
    public static void main(String[] args) {
        //polymorphism
        // tai sao cần -> tạo ra khả năng transition between object này sang object khác,
        // type này sang type khác trong cùng 1 mối quan he is relationship
        // nhưng với đk phải có từ 2 class con trở lên
        Ech trungEch = new TrưngEch();
        trungEch = new NongNoc();
        trungEch = new EchCon();

    }
}
