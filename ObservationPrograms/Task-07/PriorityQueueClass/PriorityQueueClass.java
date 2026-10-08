package collectionframework;
import java.util.PriorityQueue;

    public class PriorityQueueExample {
        public static void main(String[] args) {

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            // add()
            pq.add(30);
            pq.add(10);
            pq.add(20);

            System.out.println("Priority Queue: " + pq);

            // offer()
            pq.offer(5);
            System.out.println("After offer: " + pq);

            // peek()
            System.out.println("Head: " + pq.peek());

            // poll()
            System.out.println("Removed Head: " + pq.poll());
            System.out.println("After poll: " + pq);

            // remove()
            pq.remove(20);
            System.out.println("After remove: " + pq);

            // contains()
            System.out.println("Contains 30: " +
                    pq.contains(30));

            // size()
            System.out.println("Size: " + pq.size());
        }
    }
