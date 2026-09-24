package collectionframework;
import java.util.LinkedList;

    public class LinkedListExample {
        public static void main(String[] args) {

            LinkedList<String> list = new LinkedList<>();

            // add()
            list.add("B");
            list.add("C");
            System.out.println("List: " + list);

            // addFirst()
            list.addFirst("A");

            // addLast()
            list.addLast("D");

            System.out.println("After addFirst/addLast: " + list);

            // get()
            System.out.println("Element at index 2: " + list.get(2));

            // getFirst()
            System.out.println("First: " + list.getFirst());

            // getLast()
            System.out.println("Last: " + list.getLast());

            // remove(index)
            list.remove(1);
            System.out.println("After remove index: " + list);

            // remove(Object)
            list.remove("C");
            System.out.println("After remove object: " + list);

            // Add elements again
            list.addFirst("X");
            list.addLast("Y");

            // removeFirst()
            System.out.println("Removed First: " + list.removeFirst());

            // removeLast()
            System.out.println("Removed Last: " + list.removeLast());

            // offer()
            list.offer("Mango");
            System.out.println("After offer: " + list);

            // peek()
            System.out.println("Peek: " + list.peek());

            // poll()
            System.out.println("Poll: " + list.poll());

            System.out.println("Final List: " + list);
        }
    }

