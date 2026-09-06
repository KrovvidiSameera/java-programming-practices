package javacore;
public class ClassCastExample {
        public static void main(String[] args) {

            Object value = "Hello Java";

            try {
                System.out.println("Value: " + value);

                Integer number = (Integer) value;

                System.out.println("Number: " + number);
            }
            catch (ClassCastException e) {
                System.out.println("Error: Cannot convert String into Integer.");
            }

            System.out.println("Program ended.");
        }
    }
