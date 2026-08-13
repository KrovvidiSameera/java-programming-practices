package javacore;

interface Father {
    int age = 50;
    void work();
}

interface Mother {
    int age = 45;
    void cook();
}

 public class Child implements Father, Mother {
    public void work() {
        System.out.println("Father works");
        System.out.println("Father age: " + Father.age);
    }
    public void cook() {
        System.out.println("Mother cooks");
        System.out.println("Mother age: " + Mother.age);
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.work();
        c.cook();
    }
}
