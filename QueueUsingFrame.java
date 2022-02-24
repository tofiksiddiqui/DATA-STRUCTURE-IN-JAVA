import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingFrame {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue);
        System.out.println("Front element is : " + queue.peek());
        System.out.println("Deleted element is : " + queue.poll());
        System.out.println("Queue contains : " + queue);
    }
}
