package collectionframework;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

    public class ListIteratorExample {
        public static void main(String[] args) {

            List<String> list = new ArrayList<>();

            list.add("Apple");
            list.add("Banana");
            list.add("Mango");

            ListIterator<String> it = list.listIterator();

            // Forward direction
            System.out.println("Forward:");

            while (it.hasNext()) {

                System.out.println(it.next());
            }

            // Backward direction
            System.out.println("\nBackward:");

            while (it.hasPrevious()) {

                System.out.println(it.previous());
            }
        }
    }
