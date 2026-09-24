package collectionframework;
import java.util.TreeSet;

    public class TreeSetExample {
        public static void main(String[] args) {

            TreeSet<Integer> set = new TreeSet<>();

            // add()
            set.add(30);
            set.add(10);
            set.add(50);
            set.add(20);
            set.add(40);

            System.out.println("TreeSet: " + set);

            // remove()
            set.remove(20);
            System.out.println("After remove: " + set);

            // contains()
            System.out.println("Contains 30: " +
                    set.contains(30));

            // first()
            System.out.println("First: " + set.first());

            // last()
            System.out.println("Last: " + set.last());

            // lower()
            System.out.println("Lower than 30: " +
                    set.lower(30));

            // higher()
            System.out.println("Higher than 30: " +
                    set.higher(30));

            // floor()
            System.out.println("Floor of 30: " +
                    set.floor(30));

            // ceiling()
            System.out.println("Ceiling of 30: " +
                    set.ceiling(30));

            // pollFirst()
            System.out.println("Removed First: " +
                    set.pollFirst());

            // pollLast()
            System.out.println("Removed Last: " +
                    set.pollLast());

            System.out.println("Final TreeSet: " + set);
        }
    }

