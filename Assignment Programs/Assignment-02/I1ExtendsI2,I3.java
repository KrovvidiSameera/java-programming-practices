package javacore;
interface I2 {
    void add();
}

interface I3 {
    void multiply();
}

interface I1 extends I2, I3 {
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
    public void multiply() {
        System.out.println("Multiplication = " + (a * b));
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
        obj.multiply();
        obj.subtract();
    }
}

