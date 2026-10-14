import java.util.Scanner;

// User-defined exception
class InvalidMobileNumberException extends Exception {
    InvalidMobileNumberException(String message) {
        super(message);
    }
}

public class MobileNumberValidation {

    public static void validateMobile(String mobile)
            throws InvalidMobileNumberException {

        // Check length
        if (mobile.length() != 10) {
            throw new InvalidMobileNumberException(
                "Mobile number must contain exactly 10 digits.");
        }

        // Check whether all characters are digits
        for (int i = 0; i < mobile.length(); i++) {
            if (mobile.charAt(i) < '0' ||
                mobile.charAt(i) > '9') {
                throw new InvalidMobileNumberException(
                    "Mobile number must contain only digits.");
            }
        }

        // Check first digit
        if (mobile.charAt(0) < '6' ||
            mobile.charAt(0) > '9') {
            throw new InvalidMobileNumberException(
                "Mobile number must start with 6, 7, 8, or 9.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String mobile = sc.nextLine();

        try {
            validateMobile(mobile);
            System.out.println("Valid mobile number.");
        } catch (InvalidMobileNumberException e) {
            System.out.println("Invalid mobile number: "
                               + e.getMessage());
        }

        sc.close();
    }
}
/*Sample output
Example 1: Valid input
Enter mobile number: 9876543210
Valid mobile number.
Example 2: Incorrect length
Enter mobile number: 98765
Invalid mobile number: Mobile number must contain exactly 10 digits.
Example 3: Contains letters
Enter mobile number: 98765abc10
Invalid mobile number: Mobile number must contain only digits.
*/
