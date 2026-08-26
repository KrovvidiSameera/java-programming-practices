package javacore;
interface I2 {
    void add();
}

interface I1 extends I2 {
    void subtract();
}

class C1 implements I1 {

    int a = 20;
    int b = 10;
  @Override
    public void add() {
        System.out.println("Addition = " + (a + b));
    }
 @Override
    public void subtract() {
        System.out.println("Subtraction = " + (a - b));
    }
}

public class Main {
    public static void main(String[] args) {

        C1 obj = new C1();

        obj.add();
        obj.subtract();
    }
}

