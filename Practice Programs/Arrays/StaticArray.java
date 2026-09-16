package javacore;
public class StaticArray{
    public static void main(String[] args) {

        // Declare and create an array of size 5
        int[] numbers = new int[5];

        // Store values in the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Display the array values
        System.out.println("Array elements:");

        // Loop through the array
        for (int i = 0; i < 5; i++) {

            // Print each element
            System.out.println(numbers[i]);
        }
    }
}
