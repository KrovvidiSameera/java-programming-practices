public class ConDemo {
    int rollno;
    String name;
    float fee;

    public ConDemo(){
        this.rollno=2345;
        this.name="maya";
        this.fee=5000.50f;
    }

    void sample(){
        System.out.println("this is test sample of constructor");
        System.out.println("roll no is "+this.rollno);
        System.out.println("name is "+this.name);
        System.out.println("fee is "+this.fee);
    }
    public static void main(String[] args){
        int x=10,y=20;
        int c=x+y;
        System.out.println("result is "+c);
        ConDemo at=new ConDemo();
        at.sample();
    }
}
