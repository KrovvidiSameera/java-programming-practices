File 1: Roman.java

package number;
import java.util.HashMap;
import java.util.Map;

public class Roman {

    // Converts a Roman numeral into an integer
    public int romanToInteger(String s) {

        // Store the values of Roman symbols
        Map<Character, Integer> values = new HashMap<>();

        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int result = 0;

        // Process each character in the Roman numeral
        for (int i = 0; i < s.length(); i++) {

            int current = values.get(s.charAt(i));

            // Subtract if the current value is smaller
            // than the next value
            if (i + 1 < s.length()
                    && current < values.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                // Otherwise, add the current value
                result += current;
            }
        }

        return result;
    }
}

File 2: RomanDemo.java

import java.util.Scanner;
import number.Roman;

public class RomanDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create an object of the Roman class
        Roman r = new Roman();

        // Read the Roman numeral
        System.out.print("Enter a Roman numeral: ");
        String s = sc.nextLine().toUpperCase();

        // Convert and display the result
        int result = r.romanToInteger(s);

        System.out.println("Integer value: " + result);

        sc.close();
    }
}

