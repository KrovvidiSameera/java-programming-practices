package javacore;
public class TryCatchImplementation {
    public static void main(String[] args) {
        // try block contains code that may cause an exception
        try {
            int a = 10 / 0;
        }
        // catch block handles the exception
        catch (ArithmeticException e) {
            // Print the error message
            System.out.println("Cannot divide by zero");
        }
    }
}
