package collectionframework;
import java.util.Hashtable;
import java.util.Enumeration;

    public class HashTableExample {
        public static void main(String[] args) {

            Hashtable<Integer, String> table = new Hashtable<>();

            // put()
            table.put(101, "Rahul");
            table.put(102, "Priya");
            table.put(103, "John");

            System.out.println("Hashtable: " + table);

            // get()
            System.out.println("Value of key 102: " +
                    table.get(102));

            // containsKey()
            System.out.println("Contains key 101: " +
                    table.containsKey(101));

            // containsValue()
            System.out.println("Contains value John: " +
                    table.containsValue("John"));

            // remove()
            table.remove(103);
            System.out.println("After remove: " + table);

            // size()
            System.out.println("Size: " + table.size());

            // isEmpty()
            System.out.println("Is Empty: " + table.isEmpty());

            // keys()
            System.out.println("\nKeys:");

            Enumeration<Integer> keys = table.keys();

            while (keys.hasMoreElements()) {
                System.out.println(keys.nextElement());
            }

            // elements()
            System.out.println("\nValues:");

            Enumeration<String> values = table.elements();

            while (values.hasMoreElements()) {
                System.out.println(values.nextElement());
            }
        }
    }

