package collectionframework;
import java.util.ArrayDeque;

    public class ArrayDequeExample {
        public static void main(String[] args) {

            ArrayDeque<String> dq = new ArrayDeque<>();

            // addFirst() / addLast()
            dq.addFirst("B");
            dq.addLast("C");
            dq.addFirst("A");
            dq.addLast("D");

            System.out.println("Deque: " + dq);

            // offerFirst() / offerLast()
            dq.offerFirst("Start");
            dq.offerLast("End");

            System.out.println("After offer: " + dq);

            // peekFirst() / peekLast()
            System.out.println("First: " + dq.peekFirst());
            System.out.println("Last: " + dq.peekLast());

            // pollFirst() / pollLast()
            System.out.println("Removed First: " + dq.pollFirst());
            System.out.println("Removed Last: " + dq.pollLast());

            System.out.println("Final Deque: " + dq);
        }
    }


