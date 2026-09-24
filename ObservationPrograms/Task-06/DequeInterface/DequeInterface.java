package collectionframework;
import java.util.Deque;
import java.util.ArrayDeque;

    public class DequeExample {
        public static void main(String[] args) {

            Deque<String> dq = new ArrayDeque<>();

            // addFirst()
            dq.addFirst("B");

            // addLast()
            dq.addLast("C");

            dq.addFirst("A");
            dq.addLast("D");

            System.out.println("Deque: " + dq);

            // offerFirst()
            dq.offerFirst("Start");

            // offerLast()
            dq.offerLast("End");

            System.out.println("After offer: " + dq);

            // peekFirst()
            System.out.println("First: " + dq.peekFirst());

            // peekLast()
            System.out.println("Last: " + dq.peekLast());

            // pollFirst()
            System.out.println("Removed First: " + dq.pollFirst());

            // pollLast()
            System.out.println("Removed Last: " + dq.pollLast());

            System.out.println("Deque after removal: " + dq);

            // removeFirst()
            dq.removeFirst();

            // removeLast()
            dq.removeLast();

            System.out.println("Final Deque: " + dq);
        }
    }
