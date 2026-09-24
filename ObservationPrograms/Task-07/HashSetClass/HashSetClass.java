package collectionframework;
import java.util.HashSet;

    public class HashSetExample {
        public static void main(String[] args) {

            HashSet<String> set = new HashSet<>();

            // add()
            set.add("Apple");
            set.add("Banana");
            set.add("Mango");
            set.add("Apple");   // Duplicate

            System.out.println("HashSet: " + set);

            // remove()
            set.remove("Banana");
            System.out.println("After remove: " + set);

            // contains()
            System.out.println("Contains Mango: " +
                    set.contains("Mango"));

            // size()
            System.out.println("Size: " + set.size());

            // isEmpty()
            System.out.println("Is Empty: " + set.isEmpty());

            // clear()
            set.clear();

            System.out.println("After clear: " + set);
        }
    }

