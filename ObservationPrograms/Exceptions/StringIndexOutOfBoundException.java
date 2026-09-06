package javacore;

public class StringIndexOOBException {
        public static void main(String[] args) {

            String word = "Java";

            try {
                System.out.println("Word: " + word);
                System.out.println("First character: " + word.charAt(0));
                System.out.println("Last character: " + word.charAt(3));

                System.out.println("Character: " + word.charAt(10));
            }
            catch (StringIndexOutOfBoundsException e) {
                System.out.println("Error: Character position is invalid.");
            }

            System.out.println("Program ended.");
        }
    }
