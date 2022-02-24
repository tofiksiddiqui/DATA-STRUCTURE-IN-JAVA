import java.util.Scanner;

public class CircularLinkedList {
    Scanner scanner = new Scanner(System.in);

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void insertAtBegin() {
        int data;
        System.out.println("Enter the data : ");
        data = scanner.nextInt();
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            newNode.next = head.next;
        }
        head.next = newNode;

    }

    public void insertAtMid() {
        Node temp1;
        Node temp2;
        System.out.println("Enter the position : ");
        int position = scanner.nextInt();
        temp1 = head;
        temp2 = temp1.next;
        for (int i = 0; i < (position - 1); i++) {
            temp1 = temp2;
            temp2 = temp2.next;
            i++;
        }
        System.out.println("Enter the data : ");
        int data = scanner.nextInt();
        Node newNode = new Node(data);
        newNode.next = temp2;
        temp1.next = newNode;

    }

    public void insertAtEnd() {
        Node temp;
        Node tail;
        System.out.println("Enter the data : ");
        int data = scanner.nextInt();
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("List is empty ! ");
        } else {
            temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            tail = newNode;
            temp.next = newNode;
            newNode.next = head;

        }

    }

    public void DeleteAtBegin() {
        Node temp;
        if (head == null) {
            System.out.println("List is empty !");
        } else {
            temp = head;
            temp = temp.next;
            head = temp;
            tail.next = head;
        }

    }

    public void DeleteAtMid() {
        Node temp1;
        Node temp2;
        System.out.println("Enter the position to delete the node : ");
        int position = scanner.nextInt();
        if (head == null) {
            System.out.println("List is Empty ! ");
            Scanner scanner = new Scanner(System.in);
        } else {
            temp1 = head;
            temp2 = temp1.next;
            for (int i = 0; i < (position - 1); i++) {
                temp1 = temp2;
                temp2 = temp2.next;
                i++;
            }
            temp1.next = temp2.next;
        }

    }

    public void DeleteAtEnd() {
        Node temp1;
        Node temp2;
        if (head == null) {
            System.out.println("List is empty ! ");
        } else {
            temp1 = head;
            temp2 = temp1.next;
            while (temp2.next != head) {
                temp1 = temp2;
                temp2 = temp2.next;
            }
            temp1.next = head;
            tail = temp1;
        }

    }

    public int FindLength() {
        int count = 0;
        Node temp;
        if (head == null) {
            System.out.println("List is empty !");
        } else {
            temp = head;
            do {
                count++;
                temp = temp.next;
            } while (temp != head);
        }
        return count;
    }

    public void Display() {
        Node temp;
        if (head == null) {
            System.out.println("List is empty ! \n\n");
        } else {
            temp = head;
            do {
                System.out.println("Element is : " + temp.data);
                temp = temp.next;
            } while (temp != head);
        }
    }

    public static void main(String[] args) {
        CircularLinkedList LList = new CircularLinkedList();
        int choice;
        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1-Insert at Begin");
            System.out.println("2-Insert at given position");
            System.out.println("3-Insert at End");
            System.out.println("4-Display List");
            System.out.println("5-Delete at Begin");
            System.out.println("6-Delete at given position");
            System.out.println("7-Delete at End");
            System.out.println("8-Length");
            System.out.println("9-Exit");
            System.out.println("-------------------------------------\n");
            System.out.println("Enter the choice : ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println("-------------------------------------\n");
            switch (choice) {
                case 1:
                    LList.insertAtBegin();
                    break;
                case 2:
                    LList.insertAtMid();
                    break;
                case 3:
                    LList.insertAtEnd();
                    break;
                case 4:
                    LList.Display();
                    break;
                case 5:
                    LList.DeleteAtBegin();
                    break;
                case 6:
                    LList.DeleteAtMid();
                    break;
                case 7:
                    LList.DeleteAtEnd();
                    break;
                case 8:
                    int findLength;
                    findLength = LList.FindLength();
                    System.out.println("Length is : " + findLength);
                    break;
                case 9:
                    System.out.println("Exitting...!");
                    return;
                default:
                    System.out.println("Invalid Choice !\n\n");
            }
        }

    }
}
