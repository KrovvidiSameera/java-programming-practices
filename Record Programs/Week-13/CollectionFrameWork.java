package javacore;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneLetterCombinations {

    // Mapping of digits to telephone keypad letters
    static String[] keypad = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    // Generate all possible letter combinations
    public static List<String> letterCombinations(String digits) {

        List<String> combinations = new ArrayList<>();

        // Return an empty list if input is empty
        if (digits.isEmpty()) {
            return combinations;
        }

        // Begin with an empty combination
        combinations.add("");

        // Process each digit
        for (int i = 0; i < digits.length(); i++) {

            int digit = digits.charAt(i) - '0';
            String letters = keypad[digit];

            List<String> newCombinations = new ArrayList<>();

            // Combine existing strings with each mapped letter
            for (String combination : combinations) {
                for (char letter : letters.toCharArray()) {
                    newCombinations.add(combination + letter);
                }
            }

            combinations = newCombinations;
        }

        return combinations;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the digit string
        System.out.print("Enter digits (2-9): ");
        String digits = sc.nextLine();

        // Display all combinations
        List<String> result = letterCombinations(digits);

        System.out.println("Letter combinations: " + result);

        sc.close();
    }
}

