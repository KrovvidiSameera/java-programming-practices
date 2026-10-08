package collectionframework;
import java.util.TreeMap;

    public class TreeMapExample {
        public static void main(String[] args) {

            TreeMap<Integer, String> map = new TreeMap<>();

            // put()
            map.put(103, "John");
            map.put(101, "Rahul");
            map.put(105, "Anil");
            map.put(102, "Priya");
            map.put(104, "Ravi");

            System.out.println("TreeMap: " + map);

            // get()
            System.out.println("Value of key 102: " +
                    map.get(102));

            // containsKey()
            System.out.println("Contains key 101: " +
                    map.containsKey(101));

            // containsValue()
            System.out.println("Contains value John: " +
                    map.containsValue("John"));

            // firstKey()
            System.out.println("First Key: " +
                    map.firstKey());

            // lastKey()
            System.out.println("Last Key: " +
                    map.lastKey());

            // higherKey()
            System.out.println("Higher Key than 102: " +
                    map.higherKey(102));

            // lowerKey()
            System.out.println("Lower Key than 102: " +
                    map.lowerKey(102));

            // ceilingKey()
            System.out.println("Ceiling Key of 102: " +
                    map.ceilingKey(102));

            // floorKey()
            System.out.println("Floor Key of 102: " +
                    map.floorKey(102));

            // entrySet()
            System.out.println("Entries: " +
                    map.entrySet());

            // remove()
            map.remove(105);
            System.out.println("After remove: " + map);
        }
    }
    
