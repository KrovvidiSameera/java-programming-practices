package javacore;
public class ThrowsImplementation {

    // Method declares that it may throw an exception
    static void test() throws Exception {

        // Manually throw an exception
        throw new Exception("Something went wrong");
    }

    public static void main(String[] args) {

        // try block calls the method that may throw an exception
        try {
            test();
        }

        // catch block handles the exception
        catch (Exception e) {

            // Print the exception message
            System.out.println(e.getMessage());
        }
    }
}
