package javacore;
public class ConDemoParameter {
    int rollno;
    String name;
    float fee;

    public ConDemoParameter(int i,String n,float f){
        this.rollno=i;
        this.name=n;
        this.fee=f;
    }
    void example(){
        int x=6,y=10;
        int z=x*y;
        System.out.println("Multiplication of X and Y is "+z);
        System.out.println("Let us try with parameters");
        System.out.println("Rollno is "+this.rollno);
        System.out.println("Name is "+this.name);
        System.out.println("Fee is "+this.fee);
    }
    public static void main(String[] args){
        int a=89,b=45;
        int c=a+b;
        System.out.println("Result is "+c);
        ConDemoParameter bt=new ConDemoParameter(2345,"Maya",5000.256f);
        bt.example();
    }
}
