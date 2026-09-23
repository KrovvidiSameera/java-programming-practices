package collectionframework;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

    public class ListExample {
        public static void main(String[] args) {

            List<String> list = new ArrayList<>();

            // add()
            list.add("Apple");
            list.add("Banana");
            list.add("Mango");
            list.add("Apple");

            System.out.println("List: " + list);

            // add(index, element)
            list.add(1, "Orange");
            System.out.println("After adding at index 1: " + list);

            // get()
            System.out.println("Element at index 2: " + list.get(2));

            // set()
            list.set(2, "Grapes");
            System.out.println("After set: " + list);

            // remove(index)
            list.remove(1);
            System.out.println("After remove: " + list);

            // indexOf()
            System.out.println("First Apple index: " + list.indexOf("Apple"));

            // lastIndexOf()
            System.out.println("Last Apple index: " + list.lastIndexOf("Apple"));

            // subList()
            System.out.println("SubList: " + list.subList(0, 2));

            // sort()
            list.sort(Comparator.naturalOrder());
            System.out.println("Sorted List: " + list);
        }
    }

