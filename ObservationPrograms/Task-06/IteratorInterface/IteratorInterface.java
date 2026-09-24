package collectionframework;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

    public class IteratorExample {
        public static void main(String[] args) {

            List<String> list = new ArrayList<>();

            list.add("Apple");
            list.add("Banana");
            list.add("Mango");

            Iterator<String> it = list.iterator();

            while (it.hasNext()) {

                String item = it.next();

                System.out.println(item);

                // Remove Banana
                if (item.equals("Banana")) {
                    it.remove();
                }
            }

            System.out.println("After removal: " + list);
        }
    }

