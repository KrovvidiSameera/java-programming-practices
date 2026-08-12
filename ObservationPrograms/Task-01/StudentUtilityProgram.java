import java.util.Scanner;
public class StudentUtilityProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Part 1");
        System.out.println("2. Part 2");
        System.out.println("3. Part 3");
        System.out.println("4. Part 4");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter case 1-4 ");
                int achoice = sc.nextInt();
                String name="";
                int rollno;double marks1,marks2,marks3,total,percentage;
                switch (achoice) {

                    case 1:
                        System.out.println("Student Information");
                        System.out.println("Name : Sameera");
                        System.out.println("Roll No : 102");
                        break;

                    case 2:
                        System.out.println("Enter Student Name: ");
                        name = sc.nextLine();

                        System.out.println("Enter Roll Number: ");
                        rollno = sc.nextInt();

                        System.out.println("Enter English Marks: ");
                        marks1 = sc.nextDouble();

                        System.out.print("Enter Maths Marks: ");
                        marks2 = sc.nextDouble();

                        System.out.print("Enter Social Marks: ");
                        marks3 = sc.nextDouble();
                        break;

                    case 3:
                        System.out.print("Enter English Marks: ");
                        marks1 = sc.nextDouble();

                        System.out.print("Enter Maths Marks: ");
                        marks2 = sc.nextDouble();

                        System.out.print("Enter Social Marks: ");
                        marks3 = sc.nextDouble();

                        total = marks1 + marks2 + marks3;
                        percentage = (total / 300) * 100;

                        System.out.println("Total = " + total);
                        System.out.println("Percentage = " + percentage);
                        break;

                    case 4:
                        System.out.print("Enter Student Name: ");
                        name = sc.nextLine();

                        System.out.print("Enter Roll Number: ");
                        rollno = sc.nextInt();

                        System.out.print("Enter English Marks: ");
                        marks1 = sc.nextDouble();

                        System.out.print("Enter Maths Marks: ");
                        marks2 = sc.nextDouble();

                        System.out.print("Enter Social Marks: ");
                        marks3 = sc.nextDouble();

                        total = marks1 + marks2 + marks3;
                        percentage = (total / 300) * 100;

                        System.out.println("\n----- RESULT -----");
                        System.out.println("Name : " + name);
                        System.out.println("Roll No : " + rollno);
                        System.out.println("Total : " + total);
                        System.out.println("Percentage : " + percentage);
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }
                break;
            case 2:
                System.out.println("enter case 1-4");
                int bchoice = sc.nextInt();
                switch (bchoice) {
                    case 1:
                        System.out.print("Enter a number: ");
                        int n = sc.nextInt();

                        if (n % 2 == 0)
                            System.out.println("Even Number");
                        else
                            System.out.println("Odd Number");
                        break;

                    case 2:
                        System.out.print("Enter first number: ");
                        int a = sc.nextInt();

                        System.out.print("Enter second number: ");
                        int b = sc.nextInt();

                        System.out.print("Enter third number: ");
                        int c = sc.nextInt();

                        if (a >= b && a >= c)
                            System.out.println("Largest = " + a);
                        else if (b >= a && b >= c)
                            System.out.println("Largest = " + b);
                        else
                            System.out.println("Largest = " + c);
                        break;

                    case 3:
                        System.out.print("Enter percentage: ");
                        double per = sc.nextDouble();

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

                    case 4:
                        System.out.print("Enter day number (1-7): ");
                        int day = sc.nextInt();

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
                            default:
                                System.out.println("Invalid Day");
                        }
                        break;

                }
            case 3:
                System.out.println("enter case 1-4");
                int cchoice = sc.nextInt();

                switch (cchoice) {

                    case 1:
                        System.out.print("Enter a number: ");
                        int num = sc.nextInt();

                        System.out.println("Multiplication Table:");
                        for (int i = 1; i <= 10; i++) {
                            System.out.println(num + " x " + i + " = " + (num * i));
                        }
                        break;

                    case 2:
                        System.out.print("Enter N: ");
                        int n = sc.nextInt();

                        System.out.println("Numbers from 1 to " + n + ":");
                        for (int i = 1; i <= n; i++) {
                            System.out.print(i + " ");
                        }
                        break;

                    case 3:
                        System.out.print("Enter N: ");
                        int m = sc.nextInt();

                        int sum = 0;
                        for (int i = 1; i <= m; i++) {
                            sum = sum + i;
                        }

                        System.out.println("Sum = " + sum);
                        break;

                    case 4:
                        System.out.print("Enter number of terms: ");
                        int terms = sc.nextInt();

                        int a = 0, b = 1, c;

                        System.out.println("Fibonacci Series:");
                        for (int i = 1; i <= terms; i++) {
                            System.out.print(a + " ");
                            c = a + b;
                            a = b;
                            b = c;
                        }
                        break;


                }
            case 4:
                System.out.println("enter case 1-4");
                    int dchoice = sc.nextInt();

                switch (dchoice) {

                    case 1:
                        System.out.print("Enter a number: ");
                        int n = sc.nextInt();

                        int fact = 1;
                        for (int i = 1; i <= n; i++) {
                            fact = fact * i;
                        }

                        System.out.println("Factorial = " + fact);
                        break;

                    case 2:
                        System.out.print("Enter a number: ");
                        int num = sc.nextInt();

                        int count = 0;
                        for (int i = 1; i <= num; i++) {
                            if (num % i == 0) {
                                count++;
                            }
                        }

                        if (count == 2)
                            System.out.println("Prime Number");
                        else
                            System.out.println("Not a Prime Number");
                        break;

                    case 3:
                        System.out.print("Enter first number: ");
                        int a = sc.nextInt();

                        System.out.print("Enter second number: ");
                        int b = sc.nextInt();

                        if (a > b)
                            System.out.println("Maximum = " + a);
                        else
                            System.out.println("Maximum = " + b);
                        break;

                    case 4:
                        System.out.print("Enter radius: ");
                        double r = sc.nextDouble();

                        double area = 3.14 * r * r;

                        System.out.println("Area of Circle = " + area);
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }
                break;
        }

    }
}
