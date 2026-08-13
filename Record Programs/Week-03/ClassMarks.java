package javacore;
import java.util.Scanner;

public class ClassMarks {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        int m1 = obj.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = obj.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = obj.nextInt();

        System.out.print("Enter Mark 4: ");
        int m4 = obj.nextInt();

        System.out.print("Enter Mark 5: ");
        int m5 = obj.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}
