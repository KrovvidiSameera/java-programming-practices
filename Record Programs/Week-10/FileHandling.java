File 1: "sample.txt"
Peter Piper picked a peck of pickled peppers
A peck of pickled peppers Peter Piper picked
If Peter Piper picked a peck of pickled peppers
Where's the peck of pickled peppers Peter Piper picked?

File 2: "PatternFrequency.java"
package javacore;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PatternFrequency {

    // Count occurrences of a pattern in the text
    public static int countPattern(String text, String pattern) {
        int count = 0;
        int index = 0;

        // Find each occurrence, including overlapping matches
        while ((index = text.indexOf(pattern, index)) != -1) {
            count++;
            index++;
        }

        return count;
    }

    public static void main(String[] args) {

        StringBuilder text = new StringBuilder();

        // Read contents from sample.txt
        try (Scanner sc = new Scanner(new File("sample.txt"))) {
            while (sc.hasNextLine()) {
                text.append(sc.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("sample.txt file not found.");
            return;
        }

        // Convert text to lowercase for case-insensitive counting
        String content = text.toString().toLowerCase();

        // Count the patterns
        int peCount = countPattern(content, "pe");
        int piCount = countPattern(content, "pi");

        // Display the results
        System.out.println("'pe' - no of occurrences - " + peCount);
        System.out.println("'pi' - no of occurrences - " + piCount);
    }
}

