package javacore;
public class SampleProg {   
    int t=5;
    int add() {
        int x = 2, y = 3;
        return (x + y);
    }
    int mul(int a,int b,int c){
        return (a*b*c);
    }
    public static void main(String[] args){
        SampleProg c=new SampleProg();
        int z=c.add();
        int d=c.mul(3,4,5);
        System.out.println("sum is"+z);
        System.out.println("muliplication is"+d);
        System.out.println("value is"+c.t);

    }
}

