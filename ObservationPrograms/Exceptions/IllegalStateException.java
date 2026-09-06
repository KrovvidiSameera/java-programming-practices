package javacore;
import java.util.Scanner;
public class IllegalStateExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Scanner is ready.");

                scanner.close();

                System.out.println("Scanner is closed.");

                scanner.nextLine();
            }
            catch (IllegalStateException e) {
                System.out.println("Error: Scanner is already closed.");
            }

            System.out.println("Program ended.");
        }
    }
