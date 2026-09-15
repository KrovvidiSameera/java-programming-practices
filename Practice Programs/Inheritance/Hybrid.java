package javacore;

// Interface
interface Pet {

    // Interface method
    void play();
}

// Parent class
class Animal {

    // Animal method
    void eat() {
        System.out.println("Animal eats");
    }
}

// Child class
// Extends Animal and implements Pet
class Dog extends Animal implements Pet {

    // Dog method
    void bark() {
        System.out.println("Dog barks");
    }

    // Implementing interface method
    public void play() {
        System.out.println("Dog plays");
    }
}

// Multilevel inheritance
class Puppy extends Dog {

    // Puppy method
    void sleep() {
        System.out.println("Puppy sleeps");
    }
}

// Main class
public class Main {
