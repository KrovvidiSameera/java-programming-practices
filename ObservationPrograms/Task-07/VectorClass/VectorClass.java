package collectionframework;
import java.util.Vector;

    public class VectorExample {
        public static void main(String[] args) {

            Vector<String> vector = new Vector<>();

            // add()
            vector.add("Apple");
            vector.add("Banana");
            vector.add("Mango");

            System.out.println("Vector: " + vector);

            // addElement()
            vector.addElement("Orange");

            System.out.println("After addElement: " + vector);

            // get()
            System.out.println("Element at index 1: " +
                    vector.get(1));

            // set()
            vector.set(1, "Grapes");
            System.out.println("After set: " + vector);

            // remove(index)
            vector.remove(2);
            System.out.println("After remove: " + vector);

            // removeElement()
            vector.removeElement("Apple");
            System.out.println("After removeElement: " + vector);

            // size()
            System.out.println("Size: " + vector.size());

            // capacity()
            System.out.println("Capacity: " + vector.capacity());

            // contains()
            System.out.println("Contains Grapes: " +vector.contains("Grapes"));
        }
    }
