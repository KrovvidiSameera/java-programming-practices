package javacore;
public class ArrayIndexOOBException {
    public static void main(String[] args) {

        int[] marks = {80, 75, 90, 85, 70};

        try {
            System.out.println("First mark: " + marks[0]);
            System.out.println("Third mark: " + marks[2]);

            System.out.println("Sixth mark: " + marks[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index does not exist.");
        }

        System.out.println("Program ended.");
    }
}

