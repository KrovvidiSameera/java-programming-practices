package collectionframework;
import java.util.ArrayList;
import java.util.Comparator;

    public class ArrayListExample {
        public static void main(String[] args) {

            ArrayList<String> list = new ArrayList<>();

            // add()
            list.add("Apple");
            list.add("Banana");
            list.add("Mango");
            list.add("Apple");

            System.out.println("Original List: " + list);

            // add(index, element)
            list.add(1, "Orange");
            System.out.println("After add: " + list);

            // get()
            System.out.println("Element at index 2: " + list.get(2));

            // set()
            list.set(2, "Grapes");
            System.out.println("After set: " + list);

            // remove(index)
            list.remove(1);
            System.out.println("After remove index: " + list);

            // remove(Object)
            list.remove("Apple");
            System.out.println("After remove object: " + list);

            // contains()
            System.out.println("Contains Mango: " + list.contains("Mango"));

            // size()
            System.out.println("Size: " + list.size());

            // isEmpty()
            System.out.println("Is Empty: " + list.isEmpty());

            // indexOf()
            System.out.println("Index of Mango: " + list.indexOf("Mango"));

            // lastIndexOf()
            System.out.println("Last Index of Mango: " +
                    list.lastIndexOf("Mango"));

            // sort()
            list.sort(Comparator.naturalOrder());
            System.out.println("Sorted List: " + list);

            // clear()
            list.clear();
            System.out.println("After clear: " + list);
        }
    }

