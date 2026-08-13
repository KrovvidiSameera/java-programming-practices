package javacore;
interface Pet {
    void play();
}

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal implements Pet {
    void bark() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Puppy extends Dog {
    void sleep() {
        System.out.println("Puppy sleeps");
    }
}

public class Main {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();
        p.sleep();
    }
}
