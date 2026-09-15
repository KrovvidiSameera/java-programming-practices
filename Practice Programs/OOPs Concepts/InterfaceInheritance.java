package javacore;

// First interface
interface I1 {

    // Variable declared in an interface is public, static and final by default
    int a = 25;

    // Abstract method
    void demo();
}

// Second interface
interface I2 {

    // Variable declared in an interface is public, static and final by default
    int b = 39;

    // Abstract method
    void sample();
}

// Class implementing multiple interfaces
public class InterfaceImplementation implements I1, I2 {

    // Implementing the abstract method of Interface I1
    @Override
    public void demo() {
        System.out.println("this is the abstract method of interface1");
    }

    // Implementing the abstract method of Interface I2
    @Override
    public void sample() {
        System.out.println("this is the abstract method of interface 2");
    }

    // Main method - execution starts here
    public static void main(String[] args) {

        // Creating an object of InterfaceImplementation class
        InterfaceImplementation ac = new InterfaceImplementation();

        // Accessing the variable 'a' from Interface I1
        System.out.println(ac.a);

        // Accessing the variable 'b' from Interface I2
        System.out.println(ac.b);

        // Calling the demo() method of Interface I1
        ac.demo();

        // Calling the sample() method of Interface I2
        ac.sample();
    }
}
