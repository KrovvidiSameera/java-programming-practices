public class Demo {
    int e=5;  // class variable
    int add(){
        int x=10,y=20;
        return (x+y);
    }
    int mul(int a,int b,int c){
        return (a*b*c);
    }
    public static void main(String[] args){
        Demo c=new Demo();
            int z=c.add();
            int d=c.mul(12,11,34);
            System.out.println("sum is"+z);
            System.out.println("multiplication is"+d);
            System.out.println("value is"+c.e);



    }

}
