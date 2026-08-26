package javacore;
interface I1{
    int a=25;

    void demo();
}
 interface I2{
    int b=39;

    void sample();
 }

public class C1 implements I1,I2{
    @Override
    public void demo() {
        System.out.println("this is the abstract method of interface1");
    }

    @Override
    public void sample() {
         System.out.println("this is the abstract method of interface 2");
    }
    public static void main(String[] args){
        C1 ac=new C1();
        System.out.println(ac.a);
        System.out.println(ac.b);
        ac.demo();
        ac.sample();

    }
}
