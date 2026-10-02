package javacore;
public class IllegalArgumentExample {
        public static void main(String[] args) {

            Thread thread = new Thread();

            try {
                System.out.println("Setting thread priority...");

                thread.setPriority(15);

                System.out.println("Priority set successfully.");
            }
            catch (IllegalArgumentException e) {
                System.out.println("Error: Priority must be between 1 and 10.");
            }

            System.out.println("Program ended.");
        }
    }
