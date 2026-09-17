package javacore;
import java.util.*;

    // Parent class RBI
    class RBI {

        // Method to return minimum interest rate
        double rate() {
            return 4;
        }
    }

    // SBI inherits RBI
    class SBI extends RBI {

        // Override rate method for SBI
        double rate() {
            return 7;
        }
    }

    // ICICI inherits RBI
    class ICICI extends RBI {

        // Override rate method for ICICI
        double rate() {
            return 6;
        }
    }

    // PNB inherits RBI
    class PNB extends RBI {

        // Override rate method for PNB
        double rate() {
            return 5;
        }
    }

    // Main class
    public class Bank {
        public static void main(String args[]) {

            // Create Scanner object
            Scanner sc = new Scanner(System.in);

            // Ask the user to enter bank name
            System.out.printf("Enter the Bank name to find the rate of Interest : ");
            String s = sc.next();

            // Create parent class reference
            RBI b;

            // Create object based on bank name
            if(s.equalsIgnoreCase("RBI"))
                b = new RBI();
            else if(s.equalsIgnoreCase("SBI"))
                b = new SBI();
            else if(s.equalsIgnoreCase("ICICI"))
                b = new ICICI();
            else
                b = new PNB();

            // Call overridden method using parent reference
            System.out.printf("RBI rate of interest is : %.0f%%", b.rate());
        }
    }


/*Output
  Enter the Bank name to find the rate of Interest : RBI
RBI rate of interest is : 4%
*/
