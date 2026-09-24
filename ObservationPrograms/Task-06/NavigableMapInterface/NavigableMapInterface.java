package collectionframework;
import java.util.NavigableMap;
import java.util.TreeMap;

    public class NavigableMapExample {
        public static void main(String[] args) {

            NavigableMap<Integer, String> map = new TreeMap<>();

            map.put(10, "A");
            map.put(20, "B");
            map.put(30, "C");
            map.put(40, "D");
            map.put(50, "E");

            System.out.println("Map: " + map);

            // lowerKey()
            System.out.println("Lower Key than 30: " +
                    map.lowerKey(30));

            // floorKey()
            System.out.println("Floor Key of 30: " +
                    map.floorKey(30));

            // ceilingKey()
            System.out.println("Ceiling Key of 25: " +
                    map.ceilingKey(25));

            // higherKey()
            System.out.println("Higher Key than 30: " +
                    map.higherKey(30));

            // firstEntry()
            System.out.println("First Entry: " +
                    map.firstEntry());

            // lastEntry()
            System.out.println("Last Entry: " +
                    map.lastEntry());

            // pollFirstEntry()
            System.out.println("Removed First Entry: " +
                    map.pollFirstEntry());

            // pollLastEntry()
            System.out.println("Removed Last Entry: " +
                    map.pollLastEntry());

            System.out.println("After polling: " + map);

            // descendingMap()
            System.out.println("Descending Map: " +
                    map.descendingMap());
        }
    }

