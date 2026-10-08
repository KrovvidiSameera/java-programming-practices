package collectionframework;
import java.util.LinkedHashMap;

    public class LinkedHashMapExample {
        public static void main(String[] args) {

            LinkedHashMap<Integer, String> map =
                    new LinkedHashMap<>();

            // put()
            map.put(101, "Rahul");
            map.put(102, "Priya");
            map.put(103, "John");

            System.out.println("LinkedHashMap: " + map);

            // get()
            System.out.println("Value of key 102: " +
                    map.get(102));

            // containsKey()
            System.out.println("Contains key 101: " +
                    map.containsKey(101));

            // remove()
            map.remove(103);
            System.out.println("After remove: " + map);

            // keySet()
            System.out.println("Keys: " + map.keySet());

            // values()
            System.out.println("Values: " + map.values());

            // entrySet()
            System.out.println("Entries: " + map.entrySet());
        }
    }


