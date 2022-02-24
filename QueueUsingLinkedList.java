import java.util.Scanner;

public class QueueUsingLinkedList {
    Scanner scanner = new Scanner(System.in);

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    public void Enqueue() {
        System.out.println("Enter the data : ");
        int data = scanner.nextInt();
        Node newNode = new Node(data);
        if (front == null && rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void Dqueue() {
        if (front == null && rear == null) {
            System.out.println("Queue is empty !");
        } else {
            front = front.next;
        }
    }

    public void Display() {
        if (front == null && rear == null) {
            System.out.println("Queue is empty !");
        } else {
            Node temp;
            temp = front;
            while (temp != null) {
                System.out.println("Queue element is : " + temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        QueueUsingArray queueLL = new QueueUsingArray();
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
                    queueLL.Enqueue();
                    break;
                case 2:
                    queueLL.Dqueue();
                    break;
                case 3:
                    queueLL.Display();
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
