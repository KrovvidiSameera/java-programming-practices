package javacore;
public class DoubleCon {
    int i;
    String n;
    float f;

    public DoubleCon() {
        this.i = 40;
        this.n = "sara";
        this.f = 5550.234f;
    }

    void sample() {
        System.out.println("value of i " + this.i);
        System.out.println("string of n is " + this.n);
        System.out.println("value of f is " + this.f);
    }


        public DoubleCon(int a,String k,float b){
            this.i=a;
            this.n=k;
            this.f=b;
        }

        void example(){
            System.out.println("roll no is "+this.i);
            System.out.println("name is "+this.n);
            System.out.println("fees is "+this.f);

        }
        public static void main(String[] args){
            DoubleCon ct=new DoubleCon();
            DoubleCon dt=new DoubleCon(123,"sara",560.5f);
            ct.sample();
            dt.example();
    }
}
