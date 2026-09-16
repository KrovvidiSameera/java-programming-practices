package javacore;
public class FinallyExample {
    public static void main(String[] args) {

        // try block contains code that may cause an exception
        try {
            int a = 10 / 2;

            // Print the result
            System.out.println(a);
        }

        // catch block handles the exception
        catch (Exception e) {

            // Print error message
            System.out.println("Error");
        }

        // finally block always executes
        finally {

            // Print the final message
            System.out.println("Finally executed");
        }
    }
}
