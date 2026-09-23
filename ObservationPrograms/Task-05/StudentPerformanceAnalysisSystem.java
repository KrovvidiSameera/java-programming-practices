package javacore;
    import java.util.Scanner;
    class Student {
        
        // Data members
        int rollNo;
        String studentName;
        int[] marks = new int[5];

        // Constructor
        Student(int rollNo, String studentName, int[] marks) {
            this.rollNo = rollNo;
            this.studentName = studentName;
            this.marks = marks;
        }

        // Calculate total marks
        int calculateTotal() {
            int total = 0;

            for (int i = 0; i < marks.length; i++) {
                total = total + marks[i];
            }

            return total;
        }

        // Calculate average marks
        double calculateAverage() {
            return calculateTotal() / 5.0;
        }

        // Find highest marks
        int findHighest() {
            int highest = marks[0];

            for (int i = 1; i < marks.length; i++) {
                highest = Math.max(highest, marks[i]);
            }

            return highest;
        }

        // Find lowest marks
        int findLowest() {
            int lowest = marks[0];

            for (int i = 1; i < marks.length; i++) {
                lowest = Math.min(lowest, marks[i]);
            }

            return lowest;
        }

        // Calculate percentage
        double calculatePercentage() {
            double percentage = (calculateTotal() / 500.0) * 100;

            // Round to two decimal places
            return Math.round(percentage * 100.0) / 100.0;
        }

        // Assign grade
        String calculateGrade() {

            double percentage = calculatePercentage();

            if (percentage >= 90) {
                return "A+";
            }
            else if (percentage >= 80) {
                return "A";
            }
            else if (percentage >= 70) {
                return "B";
            }
            else if (percentage >= 60) {
                return "C";
            }
            else if (percentage >= 50) {
                return "D";
            }
            else {
                return "F";
            }
        }

        // Check pass or fail
        String checkResult() {

            if (calculatePercentage() >= 50) {
                return "PASS";
            }
            else {
                return "FAIL";
            }
        }

        // Display student details
        void displayDetails() {

            // String operations
            String name = studentName.trim().toUpperCase();

            System.out.println("\n========== STUDENT PERFORMANCE REPORT ==========");

            System.out.println("Student Name : " + name);
            System.out.println("Name Length  : " + name.length());
            System.out.println("Roll Number  : " + rollNo);

            System.out.println("\nSubject Marks:");

            for (int i = 0; i < marks.length; i++) {
                System.out.println("Subject " + (i + 1) + " : " + marks[i]);
            }

            System.out.println("\nTotal Marks  : " + calculateTotal());
            System.out.println("Average      : " + calculateAverage());
            System.out.println("Highest Mark : " + findHighest());
            System.out.println("Lowest Mark  : " + findLowest());
            System.out.println("Percentage   : " + calculatePercentage() + "%");
            System.out.println("Grade        : " + calculateGrade());
            System.out.println("Result       : " + checkResult());

            // Performance remark
            String grade = calculateGrade();

            if (grade.equals("A+")) {
                System.out.println("Remark       : Excellent Performance");
            }
            else if (grade.equals("A")) {
                System.out.println("Remark       : Very Good Performance");
            }
            else if (grade.equals("B")) {
                System.out.println("Remark       : Good Performance");
            }
            else if (grade.equals("C")) {
                System.out.println("Remark       : Average Performance");
            }
            else if (grade.equals("D")) {
                System.out.println("Remark       : Needs Improvement");
            }
            else {
                System.out.println("Remark       : Failed - Needs More Practice");
            }
        }
    }

    public class StudentPerformance {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Input student details
            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();

            sc.nextLine(); // Clear buffer

            System.out.print("Enter Student Name: ");
            String studentName = sc.nextLine();

            // Store marks of five subjects
            int[] marks = new int[5];

            System.out.println("\nEnter marks for 5 subjects:");

            for (int i = 0; i < 5; i++) {

                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
            }

            // Create Student object
            Student student = new Student(rollNo, studentName, marks);

            // Display complete report
            student.displayDetails();

            sc.close();
        }
    }
