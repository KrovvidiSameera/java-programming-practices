package javacore;
public class DynamicArray{
    public static void main(String[] args) {

        // Create an array of size 3
        int[] a = {10, 20, 30};

        // Create a bigger array of size 5
        int[] b = new int[5];

        // Copy old elements to new array
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        // Add new elements
        b[3] = 40;
        b[4] = 50;

        // Display the elements
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
