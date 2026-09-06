package javacore;
public class SecurityExample {
        public static void main(String[] args) {

            try {
                System.out.println("Checking security...");

                throw new SecurityException("Access denied");

            }
            catch (SecurityException e) {
                System.out.println("Error: Security permission denied.");
            }

            System.out.println("Program ended.");
        }
    }
