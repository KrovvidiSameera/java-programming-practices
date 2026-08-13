package javacore;
class Employee1 {
    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;
    public Employee1() {
        name = "Unknown";
        id = 0;
        designation = "Not Assigned";
        salary = 0;
        promotionStatus = "Not Decided";
    }
   public Employee1(String name, int id) {
        this.name = name;
        this.id = id;
        designation = "Not Assigned";
        salary = 0;
        promotionStatus = "Not Decided";
    }
    public Employee1(String name, int id, String designation,
             double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Promotion Status: " + promotionStatus);
        System.out.println();
    }
}
public class Employee {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1();
        Employee1 e2 = new Employee1("Ravi", 102);
        Employee1 e3 = new Employee1("Anil", 112, "Manager", 10000, "Promoted");
        e1.display();
        e2.display();
        e3.display();
    }
}
