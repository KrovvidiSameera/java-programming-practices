package javacore;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    // Check whether the brackets are valid
    public static boolean isValid(String s) {

        // Stack stores opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                // No opening bracket to match
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check whether the bracket types match
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Valid only when no opening brackets remain
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter brackets: ");
        String input = sc.nextLine();

        // Display whether the brackets are valid
        if (isValid(input)) {
            System.out.println("Output: valid");
        } else {
            System.out.println("Output: Not valid");
        }

        sc.close();
    }
}

