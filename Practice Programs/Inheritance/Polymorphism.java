class A{
    int x=5;
    int access=4568;

    void add(){
        System.out.println("Add from the first is" +(x+20));
    }

    void mul(){
        System.out.println("multiply from the first is" +(x*2));
    }
}

class B extends A {
    int y = 20;

    void sub() {
        System.out.println("sub" + (y - 20));
    }
@Override
    void add() {
        int i = 3, m = 5;
        System.out.println("add from the sub is" + (i + m + 200));
    }

    // Overload
    void mul(int b) {
        System.out.println("mul in the sub" + (this.x * 10));
    }
}

public class Inheritance {
    public static void main(String[] args){
        B obj=new B();
        System.out.println("variable is"+obj.x);
        obj.add();
        obj.sub();
        obj.mul(20);
        System.out.println(obj.access);
        obj.mul();
    }


}
