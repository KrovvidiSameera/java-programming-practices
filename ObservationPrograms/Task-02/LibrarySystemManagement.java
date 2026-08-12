class Book {
    private int bookId;
    private String bookName;
    private String author;
    private double price;
    public Book() {
        System.out.println("Default Constructor Called");
    }
    public Book(int id, String name, String author, double price) {
        this.bookId = id;
        this.bookName = name;
        this.author = author;
        this.price = price;
    }
    public void setBookId(int id) {
        bookId = id;
    }
    public void setBookName(String name) {
        bookName = name;
    }
    public void setAuthor(String a) {
        author = a;
    }
    public void setPrice(double p) {
        price = p;
    }
    public int getBookId() {
        return bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public String getAuthor() {
        return author;
    }
     public double getPrice() {
        return price;
    }
    public void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}
class Person {
    String name = "sara";
    int age = 12;
}
class Student extends Person {
    int rollNo = 125;
    void displayStudent() {
        System.out.println("\nStudent Details");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Roll No : " + rollNo);
    }
}
class Faculty extends Person {
    String subject = "Java";
    void displayFaculty() {
        System.out.println("\nFaculty Details");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Subject : " + subject);
    }
}
class Area {
    // Method Overloading
    void area(int side) {
        System.out.println("\nArea of Square = " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    void area(double radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}
// Method Overriding
class Vehicle {
    void display() {
        System.out.println("\nThis is a Vehicle");
    }
}
class Car extends Vehicle {
    void display() {
        System.out.println("This is a Car");
    }
}
class Bike extends Vehicle {
    void display() {
        System.out.println("This is a Bike");
    }
}
abstract class Shape {
    abstract void draw();
}
class Circle extends Shape {
    void draw() {
        System.out.println("\nDrawing Circle");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
interface Printable {
    void print();
}

class Report implements Printable {
    public void print() {
        System.out.println("\nPrinting Library Report");
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {

        Book b1 = new Book();
        b1.setBookId(101);
        b1.setBookName("Java Programming");
        b1.setAuthor("James Gosling");
        b1.setPrice(550);
        System.out.println("\nBook Details");
        b1.display();
        Book b2 = new Book(102, "Python", "Guido", 700);
        System.out.println("\nParameterized Constructor");
        b2.display();
        Student s = new Student();
        s.displayStudent();
        Faculty f = new Faculty();
        f.displayFaculty();

        // Method Overloading
        Area a = new Area();
        a.area(5);
        a.area(10, 20);
        a.area(4.5);

        // Method Overriding
        Vehicle v;
        v = new Car();
        v.display();
        v = new Bike();
        v.display();
        Shape sh;
        sh = new Circle();
        sh.draw();
        sh = new Rectangle();
        sh.draw();
        Report r = new Report();
        r.print();
    }
}
