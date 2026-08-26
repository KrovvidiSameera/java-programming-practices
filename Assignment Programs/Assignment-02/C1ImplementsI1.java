package javacore;
interface I1{
    int a=25;

    void demo();
}

public class C1 implements I1{

    @Override
    public void demo() {
        System.out.println("this is the abstract method of interface1");

    }
    public static void main(String[] args){
        C1 ac=new C1();
        System.out.println(ac.a);
        ac.demo();

    }
}

