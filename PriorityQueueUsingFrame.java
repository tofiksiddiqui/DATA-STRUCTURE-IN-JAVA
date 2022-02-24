import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

public class PriorityQueueUsingFrame {
    public static void main(String[] args) {
        Queue<Integer> pqueue = new PriorityQueue<>();
        pqueue.offer(40);
        pqueue.offer(89);
        pqueue.offer(30);
        pqueue.offer(200);
        pqueue.offer(400);
        System.out.println("Priority queue contains : " + pqueue + "But it's element is not in priority queue");
        pqueue.poll();
        System.out.println("Priority queue contains : " + pqueue);
        System.out.println("\n\n\n\n");
        System.out.println("---------Now Implementing PriorityQueue----------");
        Queue<Integer> ppqueue = new PriorityQueue<>(Comparator.reverseOrder());
        System.out.println("Priority queue contains : " + pqueue + "But it's element is not in priority queue");
        pqueue.poll();
        System.out.println("Priority queue contains : " + pqueue);
        System.out.println("\n\n\n\n");
    }
}
