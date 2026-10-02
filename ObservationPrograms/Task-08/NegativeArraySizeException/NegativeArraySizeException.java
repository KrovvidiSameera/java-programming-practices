package javacore;
public class NegativeArrayExample {
        public static void main(String[] args) {

            int size = -5;

            try {
                System.out.println("Array size: " + size);

                int[] numbers = new int[size];

                System.out.println("Array created successfully.");
            }
            catch (NegativeArraySizeException e) {
                System.out.println("Error: Array size cannot be negative.");
            }

            System.out.println("Program ended.");
        }
    }
