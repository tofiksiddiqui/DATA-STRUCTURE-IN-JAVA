import java.util.Scanner;

public class PriorityQueue {
    Scanner scanner = new Scanner(System.in);
    int QUEUE_SIZE = 1024;
    int[] queue = new int[QUEUE_SIZE];
    int[] priority = new int[QUEUE_SIZE];
    int front = -1;
    int rear = -1;

    public void Enqueue(int q, int p) {
        int i;
        if ((front == 0) && (rear == QUEUE_SIZE - 1)) {
            System.out.println("Queue is full !");
        } else {
            if (front == -1) {
                front = 0;
                rear = 0;
                queue[rear] = q;
                priority[rear] = p;
            } else if (rear == (QUEUE_SIZE - 1)) {
                for (i = front; i <= rear; i++) {
                    queue[i - front] = queue[i];
                    priority[i - front] = priority[i];
                    rear = rear - front;
                    front = 0;
                    for (i = rear; i > front; i--) {
                        if (p < priority[i]) {
                            queue[i + 1] = queue[i];
                            priority[i + 1] = priority[i];
                        } else {
                            break;
                        }
                        queue[i + 1] = q;
                        priority[i + 1] = p;
                        rear++;
                    }
                }
            } else {
                for (i = rear; i >= front; i--) {
                    if (p < priority[i]) {
                        queue[i + 1] = queue[i];
                        priority[i + 1] = priority[i];
                    } else {
                        break;
                    }
                }
                queue[i + 1] = q;
                priority[i + 1] = p;
                rear++;
            }
        }
    }

    public void Display() {
        if ((front == -1) && (rear == -1)) {
            System.out.println("Queue is empty !");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println("Element is : " + queue[i] + "\tPriority is : " + priority[i]);
            }
        }
    }

    public void Dqueue() {
        if ((front == -1) && (rear == -1)) {
            System.out.println("Queue is empty !");
        } else {
            System.out.println("Deleted element is : " + queue[front] + "\tIts priority is : " + priority[front]);
            if (front == rear) {
                front = -1;
                rear = -1;

            } else {
                front++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue pQueue = new PriorityQueue();
        int choice;
        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1-Insert From Rear");
            System.out.println("2-Delete From Front");
            System.out.println("3-Display");
            System.out.println("4-Exit");
            System.out.println("-------------------------------------\n");
            System.out.println("Enter the choice : ");
            choice = scanner.nextInt();
            System.out.println("-------------------------------------\n");
            switch (choice) {
                case 1:
                    System.out.println("Enter the size : ");
                    int n = scanner.nextInt();
                    System.out.println("Eneter the element and its priority : ");
                    int i = 0;
                    while (i < n) {
                        int q = scanner.nextInt();
                        int p = scanner.nextInt();
                        pQueue.Enqueue(q, p);
                        i++;
                    }
                    break;
                case 2:
                    pQueue.Dqueue();
                    break;
                case 3:
                    pQueue.Display();
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
