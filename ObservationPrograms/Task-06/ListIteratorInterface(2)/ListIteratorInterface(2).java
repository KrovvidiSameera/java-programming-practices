package collectionframework;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

    public class ListIteratorMethods {
        public static void main(String[] args) {

            List<String> list = new ArrayList<>();

            list.add("Apple");
            list.add("Banana");
            list.add("Mango");

            ListIterator<String> it = list.listIterator();

            // Move to Banana
            it.next();
            it.next();

            // set()
            it.set("Orange");

            System.out.println("After set: " + list);

            // add()
            it.add("Grapes");

            System.out.println("After add: " + list);

            // Move to Grapes
            it.previous();

            // remove()
            it.remove();

            System.out.println("After remove: " + list);
        }
    }


