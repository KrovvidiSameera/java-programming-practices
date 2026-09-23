package collectionframework;
import java.util.NavigableSet;
import java.util.TreeSet;

    public class NavigableSetExample {
        public static void main(String[] args) {

            NavigableSet<Integer> set = new TreeSet<>();

            set.add(10);
            set.add(20);
            set.add(30);
            set.add(40);
            set.add(50);

            System.out.println("Set: " + set);

            // lower()
            System.out.println("Lower than 30: " + set.lower(30));

            // floor()
            System.out.println("Floor of 30: " + set.floor(30));

            // ceiling()
            System.out.println("Ceiling of 25: " + set.ceiling(25));

            // higher()
            System.out.println("Higher than 30: " + set.higher(30));

            // pollFirst()
            System.out.println("Removed First: " + set.pollFirst());

            // pollLast()
            System.out.println("Removed Last: " + set.pollLast());

            System.out.println("After polling: " + set);

            // descendingSet()
            System.out.println("Descending Set: " + set.descendingSet());
        }
    }
