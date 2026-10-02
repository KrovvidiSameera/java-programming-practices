ackage javacore;
public class ArrayStoreExample {
        public static void main(String[] args) {

            String[] names = new String[3];

            Object[] values = names;

            try {
                values[0] = "Ravi";
                values[1] = "Rahul";

                System.out.println("Names added successfully.");

                values[2] = 100;
            }
            catch (ArrayStoreException e) {
                System.out.println("Error: Wrong type of value stored in array.");
            }

            System.out.println("Program ended.");
        }
    }
