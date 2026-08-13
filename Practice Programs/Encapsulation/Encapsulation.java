package javacore;
class Sample{
    int x;
    float y;
    char c;
    String k;

    public int getA(){
        return x;
    }
    public void setA(int x){
        this.x=x;
    }
    public float getB(){
        return y;
    }
    public void setB(float y){
        this.y=y;
    }
    public char getC(){
        return c;
    }
    public void setC(char c){
        this.c=c;
    }
    public String getD(){
        return k;
    }
    public void setD(){
        this.k=k;
    }
}

public class EncapsulationProgram {
    public static void main(String[] args){
        Sample s=new Sample();
        s.setA(5000);
        System.out.println(s.getA());
        s.setB(456.45f);
        System.out.println(s.getB());

    }
}
