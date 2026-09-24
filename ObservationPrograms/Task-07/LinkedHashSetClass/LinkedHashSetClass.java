package collectionframework;
import java.util.LinkedHashSet;

    public class LinkedHashSetExample {
        public static void main(String[] args) {

            LinkedHashSet<String> set = new LinkedHashSet<>();

            // add()
            set.add("Apple");
            set.add("Banana");
            set.add("Mango");
            set.add("Apple");  // Duplicate

            System.out.println("LinkedHashSet: " + set);

            // remove()
            set.remove("Banana");
            System.out.println("After remove: " + set);

            // contains()
            System.out.println("Contains Apple: " +
                    set.contains("Apple"));

            // size()
            System.out.println("Size: " + set.size());

            // clear()
            set.clear();

            System.out.println("After clear: " + set);
        }
    }
