package javacore;
import java.util.*;

    // Interface for Employee salary
    interface Employee {
        void salary();
    }

    // Regular Employee class
    class Regular implements Employee {

        // Display regular employee salary details
        public void salary() {
            System.out.println("Salary Details:\n");
            System.out.println("Basic Pay: 15000");
            System.out.println("H.R:0");
            System.out.println("T.A:5000");
            System.out.println("Total Amount:20000");
        }
    }

    // Contract Employee class
    class Contract implements Employee {

        // Display contract employee salary details
        public void salary() {
            System.out.println("Salary Details:\n");
            System.out.println("Basic Pay: 15000");
            System.out.println("H.R:0");
            System.out.println("T.A:5000");
            System.out.println("Total Amount:20000");
        }
    }

    // Main class
    public class EmployeeContractSalary {
        public static void main(String args[]) {

            // Create Scanner object for input
            Scanner sc = new Scanner(System.in);

            // Read Employee ID
            System.out.printf("Enter Employee Id: ");
            String id = sc.next();

            // Create interface reference
            Employee e;

            // Check employee type using first character of ID
            if(id.charAt(0) == 'R')
                e = new Regular();
            else
                e = new Contract();

            // Call salary method using interface reference
            e.salary();
        }
    }


\*Output
  Enter Employee Id: 202
Salary Details:
Basic Pay: 15000
H.R:0
T.A:5000
Total Amount:20000
*/
