import java.util.Scanner;

public class DoubleLinkedList {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void InsertAtBeg() {
        int data;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the data at Begining : ");
        data = scanner.nextInt();
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void InsertAtMid() {
        int data;
        int position;
        Node temp1;
        Node temp2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position : ");
        position = scanner.nextInt();
        temp1 = head;
        temp2 = temp1.next;
        for (int i = 0; i < (position - 1); i++) {
            temp1 = temp2;
            temp2 = temp2.next;
            i++;

        }
        System.out.println("Enter the data : ");
        data = scanner.nextInt();
        Node newNode = new Node(data);
        newNode.next = temp2;
        temp2.prev = newNode;
        newNode.prev = temp1;
        temp1.next = newNode;

    }

    public void InsertAtEnd() {
        Node temp;
        int data;
        System.out.println("Enter the data : ");
        Scanner scanner = new Scanner(System.in);
        data = scanner.nextInt();
        Node newNode = new Node(data);
        temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;

    }

    public void DeleteAtBeg() {
        Node temp;
        if (head == null) {
            System.out.println("List is empty !\n\n");
        } else {
            temp = head;
            temp = temp.next;
            head = temp;
        }

    }

    public void DeleteAtMid() {
        Node temp1;
        Node temp2;
        if (head == null) {
            System.out.println("List is empty ! \n");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the position to delete that node : ");
            int position = scanner.nextInt();
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
        temp1 = head;
        temp2 = temp1.next;
        while (temp2.next != null) {
            temp1 = temp2;
            temp2 = temp2.next;
        }
        temp1.next = null;

    }

    public int FindLength() {
        int count = 0;
        Node temp;
        temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return count;
    }

    public int FindMaxElement() {
        Node temp;
        int max = 0;
        if (head == null) {
            System.out.println("List is empty !\n");
        } else {
            temp = head;
            while (temp.next != null) {
                if (temp.data > max) {
                    max = temp.data;
                }
                temp = temp.next;
            }
        }
        return max;
    }

    public void Display() {
        Node temp;
        temp = head;
        if (temp == null) {
            System.out.println("List is empty ! \n\n");
        } else {
            while (temp != null) {
                System.out.println("Elemet is : " + temp.data + "\n");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList LList = new DoubleLinkedList();
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
            System.out.println("10-Find Max Element");
            System.out.println("-------------------------------------\n");
            System.out.println("Enter the choice : ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println("-------------------------------------\n");
            switch (choice) {
                case 1:
                    LList.InsertAtBeg();
                    break;
                case 2:
                    LList.InsertAtMid();
                    break;
                case 3:
                    LList.InsertAtEnd();
                    break;
                case 4:
                    LList.Display();
                    break;
                case 5:
                    LList.DeleteAtBeg();
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
                case 10:
                    int MaxElement;
                    MaxElement = LList.FindMaxElement();
                    System.out.println("Max element is : " + MaxElement);
                    break;
                default:
                    System.out.println("Invalid Choice !\n\n");
            }
        }

    }

}
