package javacore;
class X{
    int a=23;

    public X(){
   System.out.println("this is a superclass constructor");
    }

    void addition(){
        System.out.println("add is "+(a+2350));
    }
}

class Y extends X{
    int b=45,c=56;

    public Y(){
        System.out.println("this is subclass constructor");
    }

    void Multiplication(){
        System.out.println("multiplication of b and c is "+(b*c));
    }

}
public class ClassDemo {
    public static void main(String[] args){
        Y ac=new Y();
        ac.addition();
        ac.Multiplication();
    }
}
