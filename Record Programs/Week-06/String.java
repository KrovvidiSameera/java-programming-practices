package javacore;
import java.util.Scanner;

    public class LongestSubstring {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Read the input string
            System.out.print("Enter a string: ");
            String s = sc.nextLine();

            int start = 0, max = 0, begin = 0;

            // Check each character in the string
            for (int i = 0; i < s.length(); i++) {

                // Check for repeated characters
                for (int j = start; j < i; j++) {
                    if (s.charAt(j) == s.charAt(i)) {
                        // Move start after the repeated character
                        start = j + 1;
                        break;
                    }
                }

                // Update the longest substring details
                if (i - start + 1 > max) {
                    max = i - start + 1;
                    begin = start;
                }
            }

            // Extract the longest substring
            String result = s.substring(begin, begin + max);

            // Display the result
            System.out.println("Length: " + max);
            System.out.println("Substring: " + result);

            sc.close();
        }
    }
