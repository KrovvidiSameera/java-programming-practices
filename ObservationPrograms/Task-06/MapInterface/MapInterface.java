package collectionframework;
import java.util.Map;
import java.util.HashMap;

    public class MapExample {
        public static void main(String[] args) {

            Map<Integer, String> map = new HashMap<>();

            // put()
            map.put(101, "Rahul");
            map.put(102, "Priya");
            map.put(103, "John");

            System.out.println("Map: " + map);

            // get()
            System.out.println("Value of key 102: " + map.get(102));

            // containsKey()
            System.out.println("Contains key 101: " +
                    map.containsKey(101));

            // containsValue()
            System.out.println("Contains value John: " +
                    map.containsValue("John"));

            // remove()
            map.remove(103);
            System.out.println("After remove: " + map);

            // keySet()
            System.out.println("Keys: " + map.keySet());

            // values()
            System.out.println("Values: " + map.values());

            // entrySet()
            System.out.println("Entries: " + map.entrySet());

            // size()
            System.out.println("Size: " + map.size());

            // isEmpty()
            System.out.println("Is Empty: " + map.isEmpty());

            // clear()
            map.clear();

            System.out.println("After clear: " + map);
        }
    }

