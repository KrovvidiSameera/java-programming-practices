package javacore;

class Parent{
    int x=40;

    public Parent(){

        System.out.println("this is the superclass costructor");
    }
    void add(){
        System.out.println("add is "+ (x+20));
    }
}

class Child extends Parent{
    int y=20;

    public Child(){
        super();
        System.out.println("this is the subclass constructor");
    }
    void add(){
        System.out.println("add the variables in super and sub class "+ (this.y+super.x));
    }
    void callsuperclassmethod(){
        super.add();
    }

}
