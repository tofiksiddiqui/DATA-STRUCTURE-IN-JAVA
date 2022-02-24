import java.util.Scanner;

public class CircularQueueUsingArray {
    Scanner scanner = new Scanner(System.in);
    int QUEUE_SIZE = 1024;
    int front = 0;
    int rear = 0;
    int[] queue = new int[QUEUE_SIZE];

    public void Enqueue() {
        if (front == (rear + 1) % QUEUE_SIZE) {
            System.out.println("Queue is full !");
        } else {
            System.out.println("Enter the element : ");
            int data = scanner.nextInt();
            rear = (rear + 1) % QUEUE_SIZE;
            queue[rear] = data;

        }
    }

    public void Dqueue() {
        if (front == rear) {
            System.out.println("Queue is empty !");
        } else {
            front = (front + 1) % QUEUE_SIZE;
            int element = queue[front];
            System.out.println("Element deleted is : " + element);
        }
    }

    public void Display() {
        if (front == rear) {
            System.out.println("Queue is empty !");
        } else {
            for (int i = (front + 1) % QUEUE_SIZE; i <= rear; i = (i + 1) % QUEUE_SIZE) {
                System.out.println("Queue element is : " + queue[i]);
            }
        }
    }

    public static void main(String[] args) {
        CircularQueueUsingArray cQueueArray = new CircularQueueUsingArray();
        int choice;
        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1-Insert From Rear");
            System.out.println("2-Delete From Front");
            System.out.println("3-Display");
            System.out.println("4-Exit");
            System.out.println("-------------------------------------\n");
            System.out.println("Enter the choice : ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println("-------------------------------------\n");
            switch (choice) {
                case 1:
                    cQueueArray.Enqueue();
                    break;
                case 2:
                    cQueueArray.Dqueue();
                    break;
                case 3:
                    cQueueArray.Display();
                    break;
                case 4:
                    System.out.println("Exitting...!");
                    return;
                default:
                    System.out.println("Invalid Choice !\n\n");
            }
        }
    }

}
