import java.util.Scanner;

public class StackUsingLinkedList {
    Scanner scanner = new Scanner(System.in);

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    public void Push() {
        int data;
        System.out.println("Enter the element : ");
        data = scanner.nextInt();
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public void Pop() {
        Node temp;
        if (top == null) {
            System.out.println("Stack is empty !");
        } else {
            temp = top;
            temp = top.next;
            top = temp;
        }
    }

    public void Display() {
        Node temp;
        if (top == null) {
            System.out.println("Stack is empty ! ");
        } else {
            temp = top;
            while (temp != null) {
                System.out.println("Stack element is : " + temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stkll = new StackUsingLinkedList();
        int choice;
        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1-Push");
            System.out.println("2-Pop");
            System.out.println("3-Display");
            System.out.println("4-Exit");
            System.out.println("-------------------------------------\n");
            System.out.println("Enter the choice : ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println("-------------------------------------\n");
            switch (choice) {
                case 1:
                    stkll.Push();
                    break;
                case 2:
                    stkll.Pop();
                    break;
                case 3:
                    stkll.Display();
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
