package javacore;
public class ThrowImplementation {
    public static void main(String[] args) {

        // Store the age
        int age = 15;

        // Check if age is less than 18
        if (age < 18) {

            // Manually throw an exception
            throw new ArithmeticException("Not eligible");
        }

        // Print message if age is 18 or above
        System.out.println("Eligible");
    }
}
