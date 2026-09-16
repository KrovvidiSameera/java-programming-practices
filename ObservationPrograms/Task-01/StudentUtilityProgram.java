package javacore;
import java.util.Scanner;

// Main class of the program
public class StudentUtilityProgram {

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Displaying main menu
        System.out.println("1. Part 1");
        System.out.println("2. Part 2");
        System.out.println("3. Part 3");
        System.out.println("4. Part 4");

        // Taking main menu choice from the user
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        // Main switch to select different parts
        switch (choice) {

            // ================= PART 1 =================
            case 1:

                // Displaying Part 1 sub-menu
                System.out.print("Enter case 1-4 ");
                int achoice = sc.nextInt();

                // Variables for student details and marks
                String name = "";
                int rollno;
                double marks1, marks2, marks3, total, percentage;

                // Part 1 sub-menu
                switch (achoice) {

                    // Case 1: Display fixed student information
                    case 1:
                        System.out.println("Student Information");
                        System.out.println("Name : Sameera");
                        System.out.println("Roll No : 102");
                        break;

                    // Case 2: Accept student details and marks
                    case 2:
                        System.out.println("Enter Student Name: ");

                        // Reading student name
                        name = sc.nextLine();

                        System.out.println("Enter Roll Number: ");
                        rollno = sc.nextInt();

                        // Reading English marks
                        System.out.println("Enter English Marks: ");
                        marks1 = sc.nextDouble();

                        // Reading Maths marks
                        System.out.print("Enter Maths Marks: ");
                        marks2 = sc.nextDouble();

                        // Reading Social marks
                        System.out.print("Enter Social Marks: ");
                        marks3 = sc.nextDouble();
                        break;

                    // Case 3: Calculate total and percentage
                    case 3:
                        System.out.print("Enter English Marks: ");
                        marks1 = sc.nextDouble();

                        System.out.print("Enter Maths Marks: ");
                        marks2 = sc.nextDouble();

                        System.out.print("Enter Social Marks: ");
                        marks3 = sc.nextDouble();

                        // Calculating total marks
                        total = marks1 + marks2 + marks3;

                        // Calculating percentage
                        percentage = (total / 300) * 100;

                        // Displaying result
                        System.out.println("Total = " + total);
                        System.out.println("Percentage = " + percentage);
                        break;

                    // Case 4: Accept details and display complete result
                    case 4:
                        System.out.print("Enter Student Name: ");

                        // Reading student name
                        name = sc.nextLine();

                        System.out.print("Enter Roll Number: ");
                        rollno = sc.nextInt();

                        // Reading English marks
                        System.out.print("Enter English Marks: ");
                        marks1 = sc.nextDouble();

                        // Reading Maths marks
                        System.out.print("Enter Maths Marks: ");
                        marks2 = sc.nextDouble();

                        // Reading Social marks
                        System.out.print("Enter Social Marks: ");
                        marks3 = sc.nextDouble();

                        // Calculating total marks
                        total = marks1 + marks2 + marks3;

                        // Calculating percentage
                        percentage = (total / 300) * 100;

                        // Displaying complete result
                        System.out.println("\n----- RESULT -----");
                        System.out.println("Name : " + name);
                        System.out.println("Roll No : " + rollno);
                        System.out.println("Total : " + total);
                        System.out.println("Percentage : " + percentage);
                        break;

                    // Invalid Part 1 choice
                    default:
                        System.out.println("Invalid Choice");
                }

                break;


            // ================= PART 2 =================
            case 2:

                // Displaying Part 2 sub-menu
                System.out.println("enter case 1-4");
                int bchoice = sc.nextInt();

                // Part 2 sub-menu
                switch (bchoice) {

                    // Case 1: Check whether a number is even or odd
                    case 1:
                        System.out.print("Enter a number: ");
                        int n = sc.nextInt();

                        // Checking divisibility by 2
                        if (n % 2 == 0)
                            System.out.println("Even Number");
                        else
                            System.out.println("Odd Number");

                        break;


                    // Case 2: Find the largest of three numbers
                    case 2:
                        System.out.print("Enter first number: ");
                        int a = sc.nextInt();

                        System.out.print("Enter second number: ");
                        int b = sc.nextInt();

                        System.out.print("Enter third number: ");
                        int c = sc.nextInt();

                        // Comparing three numbers
                        if (a >= b && a >= c)
                            System.out.println("Largest = " + a);
                        else if (b >= a && b >= c)
                            System.out.println("Largest = " + b);
                        else
                            System.out.println("Largest = " + c);

                        break;


                    // Case 3: Find grade based on percentage
                    case 3:
                        System.out.print("Enter percentage: ");
                        double per = sc.nextDouble();

                        // Checking percentage and assigning grade
                        if (per >= 90)
                            System.out.println("Grade A");
                        else if (per >= 75)
                            System.out.println("Grade B");
                        else if (per >= 60)
                            System.out.println("Grade C");
                        else if (per >= 40)
                            System.out.println("Grade D");
                        else
                            System.out.println("Fail");

                        break;


                    // Case 4: Display day based on day number
                    case 4:
                        System.out.print("Enter day number (1-7): ");
                        int day = sc.nextInt();

                        // Nested switch for day selection
                        switch (day) {

                            case 1:
                                System.out.println("Monday");
                                break;

                            case 2:
                                System.out.println("Tuesday");
                                break;

                            case 3:
                                System.out.println("Wednesday");
                                break;

                            case 4:
                                System.out.println("Thursday");
                                break;

                            case 5:
                                System.out.println("Friday");
                                break;

                            case 6:
                                System.out.println("Saturday");
                                break;

                            case 7:
                                System.out.println("Sunday");
                                break;

                            // Invalid day number
                            default:
                                System.out.println("Invalid Day");
                        }

                        break;
                }


            // ================= PART 3 =================
            case 3:

                // Displaying Part 3 sub-menu
                System.out.println("enter case 1-4");
                int cchoice = sc.nextInt();

                // Part 3 sub-menu
                switch (cchoice) {

                    // Case 1: Display multiplication table
                    case 1:
                        System.out.print("Enter a number: ");
                        int num = sc.nextInt();

                        System.out.println("Multiplication Table:");

                        // Loop from 1 to 10
                        for (int i = 1; i <= 10; i++) {
                            System.out.println(
                                num + " x " + i + " = " + (num * i)
                            );
                        }

                        break;


                    // Case 2: Display numbers from 1 to N
                    case 2:
                        System.out.print("Enter N: ");
                        int n = sc.nextInt();

                        System.out.println(
                            "Numbers from 1 to " + n + ":"
                        );

                        // Printing numbers from 1 to N
                        for (int i = 1; i <= n; i++) {
                            System.out.print(i + " ");
                        }

                        break;


                    // Case 3: Calculate sum from 1 to N
                    case 3:
                        System.out.print("Enter N: ");
                        int m = sc.nextInt();

                        // Variable to store sum
                        int sum = 0;

                        // Adding numbers from 1 to N
                        for (int i = 1; i <= m; i++) {
                            sum = sum + i;
                        }

                        // Displaying sum
                        System.out.println("Sum = " + sum);

                        break;


                    // Case 4: Generate Fibonacci series
                    case 4:
                        System.out.print("Enter number of terms: ");
                        int terms = sc.nextInt();

                        // Initial Fibonacci values
                        int a = 0, b = 1, c;

                        System.out.println("Fibonacci Series:");

                        // Generating Fibonacci series
                        for (int i = 1; i <= terms; i++) {

                            // Display current term
                            System.out.print(a + " ");

                            // Calculate next term
                            c = a + b;

                            // Update Fibonacci values
                            a = b;
                            b = c;
                        }

                        break;
                }


            // ================= PART 4 =================
            case 4:

                // Displaying Part 4 sub-menu
                System.out.println("enter case 1-4");
                int dchoice = sc.nextInt();

                // Part 4 sub-menu
                switch (dchoice) {

                    // Case 1: Calculate factorial
                    case 1:
                        System.out.print("Enter a number: ");
                        int n = sc.nextInt();

                        // Initial factorial value
                        int fact = 1;

                        // Calculating factorial using loop
                        for (int i = 1; i <= n; i++) {
                            fact = fact * i;
                        }

                        // Displaying factorial
                        System.out.println("Factorial = " + fact);

                        break;


                    // Case 2: Check whether a number is prime
                    case 2:
                        System.out.print("Enter a number: ");
                        int num = sc.nextInt();

                        // Variable to count factors
                        int count = 0;

                        // Checking all possible divisors
                        for (int i = 1; i <= num; i++) {

                            if (num % i == 0) {
                                count++;
                            }
                        }

                        // A prime number has exactly two factors
                        if (count == 2)
                            System.out.println("Prime Number");
                        else
                            System.out.println("Not a Prime Number");

                        break;


                    // Case 3: Find maximum of two numbers
                    case 3:
                        System.out.print("Enter first number: ");
                        int a = sc.nextInt();

                        System.out.print("Enter second number: ");
                        int b = sc.nextInt();

                        // Comparing two numbers
                        if (a > b)
                            System.out.println("Maximum = " + a);
                        else
                            System.out.println("Maximum = " + b);

                        break;


                    // Case 4: Calculate area of a circle
                    case 4:
                        System.out.print("Enter radius: ");
                        double r = sc.nextDouble();

                        // Calculating area of circle
                        double area = 3.14 * r * r;

                        // Displaying area
                        System.out.println(
                            "Area of Circle = " + area
                        );

                        break;


                    // Invalid Part 4 choice
                    default:
                        System.out.println("Invalid Choice");
                }

                break;
        }

        // Closing Scanner object
        sc.close();
    }
}
