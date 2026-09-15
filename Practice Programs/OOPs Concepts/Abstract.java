package javacore;

// Abstract class
abstract class Abstract {

    // Variables
    int a = 100, b;

    // Concrete method
    void sample() {
        System.out.println("this is a concrete method");
    }

    // Abstract method
    abstract void demo();
}

// Child class
public class AbstractClasses extends Abstract {

    // Implementing abstract method
    @Override
    void demo() {
        System.out.println("this is a abstract method");
    }

    // Main method
    public static void main(String[] args) {

        // Creating object
        AbstractClasses ac = new AbstractClasses();

        // Printing variable a
        System.out.println(ac.a);

        // Printing variable b
        System.out.println(ac.b);

        // Calling concrete method
        ac.sample();

        // Calling abstract method
        ac.demo();
    }
}
