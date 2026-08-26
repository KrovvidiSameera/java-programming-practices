package javacore;
class C2{
    int a=445,b=336;

    public C2(){
        System.out.println("C2 class is inherited by C1");
    }
    void multiplication(){
        System.out.println("multiplication of a and b is "+(a*b));
    }
}

class C3{
    int c=345,d=450;

    public C3(){
        System.out.println("C3 class is also inherited by C1");
    }
    void subtraction(){
        System.out.println("subtraction of c from d is "+(d-c));
    }
}

class C1 extends C2,C3{
    int x=23,y=45;
    void addition(){
        System.out.println("addition of x and y is "+(x+y));
    }
}
public class ClassSample {
    public static void main(String[] args){
        C1 ch=new C1();
        ch.multiplication();
        ch.subtraction();
        ch.additon();
    }
}
