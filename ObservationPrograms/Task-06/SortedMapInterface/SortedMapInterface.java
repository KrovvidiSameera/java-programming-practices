package collectionframework;
import java.util.SortedMap;
import java.util.TreeMap;

    public class SortedMapExample {
        public static void main(String[] args) {

            SortedMap<Integer, String> map = new TreeMap<>();

            map.put(103, "John");
            map.put(101, "Rahul");
            map.put(105, "Anil");
            map.put(102, "Priya");
            map.put(104, "Ravi");

            System.out.println("Sorted Map: " + map);

            // firstKey()
            System.out.println("First Key: " + map.firstKey());

            // lastKey()
            System.out.println("Last Key: " + map.lastKey());

            // headMap()
            System.out.println("Head Map: " + map.headMap(103));

            // tailMap()
            System.out.println("Tail Map: " + map.tailMap(103));

            // subMap()
            System.out.println("Sub Map: " + map.subMap(102, 105));
        }
    }

