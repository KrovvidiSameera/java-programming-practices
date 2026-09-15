package javacore;

// Parent class
class A {

    // Parent variables
    int x = 5;
    int access = 4568;

    // Parent method
    void add() {
        System.out.println("Add from the first is " + (x + 20));
    }

    // Parent method
    void mul() {
        System.out.println("multiply from the first is " + (x * 2));
    }
}

// Child class
class B extends A {

    // Child variable
    int y = 20;

    // Child method
    void sub() {
        System.out.println("sub" + (y - 20));
    }

    // Method overriding
    @Override
    void add() {
        int i = 3, m = 5;
        System.out.println("add from the sub is" + (i + m + 200));
    }

    // Method overloading
    void mul(int b) {
        System.out.println("mul in the sub" + (this.x * 10));
    }
}

// Main class
public class Inheritance {

    public static void main(String[] args) {

        // Creating child object
        B obj = new B();

        // Accessing parent variable
        System.out.println("variable is" + obj.x);

        // Calling overridden
