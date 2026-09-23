package collectionframework;
import java.util.SortedSet;
import java.util.TreeSet;

    public class SortedSetExample {
        public static void main(String[] args) {

            SortedSet<Integer> set = new TreeSet<>();

            set.add(50);
            set.add(20);
            set.add(40);
            set.add(10);
            set.add(30);

            System.out.println("Sorted Set: " + set);

            // first()
            System.out.println("First: " + set.first());

            // last()
            System.out.println("Last: " + set.last());

            // headSet()
            System.out.println("HeadSet: " + set.headSet(30));

            // tailSet()
            System.out.println("TailSet: " + set.tailSet(30));

            // subSet()
            System.out.println("SubSet: " + set.subSet(20, 50));

            // comparator()
            System.out.println("Comparator: " + set.comparator());
        }
    }

