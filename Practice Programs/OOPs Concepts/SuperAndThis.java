package javacore;

// Parent class
class Parent {

    // Parent variable
    int x = 40;

    // Parent constructor
    public Parent() {
        System.out.println("this is the superclass costructor");
    }

    // Parent method
    void add() {
        System.out.println("add is " + (x + 20));
    }
}

// Child class
class Child extends Parent {

    // Child variable
    int y = 20;

    // Child constructor
    public Child() {

        // Calling parent constructor
        super();

        System.out.println("this is the subclass constructor");
    }

    // Overriding parent method
    void add() {
        System.out.println("add the variables in super and sub class "
                + (this.y + super.x));
    }

    // Calling parent method
    void callsuperclassmethod() {
        super.add();
    }
}
