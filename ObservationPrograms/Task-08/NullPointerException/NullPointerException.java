package javacore;
public class NullPointerExample {
    public static void main(String[] args) {

        String name = null;

        try {
            System.out.println("Name: " + name);
            System.out.println("Length: " + name.length());
        }
        catch (NullPointerException e) {
            System.out.println("Error: Name is null.");
        }

        System.out.println("Program ended.");
    }
}
