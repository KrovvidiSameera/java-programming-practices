package collectionframework;
import java.util.Queue;
import java.util.LinkedList;

    public class QueueExample {
        public static void main(String[] args) {

            Queue<String> q = new LinkedList<>();

            // add()
            q.add("A");
            q.add("B");
            q.add("C");

            System.out.println("Queue: " + q);

            // offer()
            q.offer("D");
            System.out.println("After offer: " + q);

            // peek()
            System.out.println("Head using peek: " + q.peek());

            // element()
            System.out.println("Head using element: " + q.element());

            // poll()
            System.out.println("Removed using poll: " + q.poll());

            // remove()
            System.out.println("Removed using remove: " + q.remove());

            System.out.println("Queue after removal: " + q);
        }
    }
