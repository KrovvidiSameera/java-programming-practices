package javacore;
import java.util.*;

// User-defined exception
class LengthNotSufficientException extends Exception {

    LengthNotSufficientException() {
        super("Invalid Mobile Number – LengthNotSufficientException");
    }
}

// Main class
public class MobileNumber {
    public static void main(String args[]) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Get mobile number from user
        System.out.print("Enter Mobile Number: ");
        String number = sc.next();

        try {

            // Check for more than 10 digits
            if (number.length() > 10) {
                throw new ArrayIndexOutOfBoundsException();
            }

            // Check for less than 10 digits
            if (number.length() < 10) {
                throw new LengthNotSufficientException();
            }

            // Check each character
            for (int i = 0; i < 10; i++) {

                // If character is not a digit
                if (!Character.isDigit(number.charAt(i))) {
                    throw new NumberFormatException();
                }
            }

            // Mobile number is valid
            System.out.println("Valid number");
        }

        // Catch excess length exception
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Invalid Mobile Number-ArrayIndexOutOfBounds Exception"
            );
        }

        // Catch insufficient length exception
        catch (LengthNotSufficientException e) {
            System.out.println(e.getMessage());
        }

        // Catch non-digit exception
        catch (NumberFormatException e) {
            System.out.println(
                    "Invalid Mobile Number – NumberFormatException"
            );
        }
    }
}


/*Output
Enter Mobile Number: 98674365
Invalid Mobile Number – LengthNotSufficientException
*/
