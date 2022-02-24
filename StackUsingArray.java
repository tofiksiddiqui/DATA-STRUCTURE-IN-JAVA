import java.util.Scanner;

import javax.lang.model.element.Element;

public class StackUsingArray {
    Scanner scanner = new Scanner(System.in);
    int[] STK = new int[1024];
    int tos = -1;

    public void push() {
        if (tos == 1023) {
            System.out.println("Stack is full !");
        } else {
            int element;
            System.out.println("Enter the element : ");
            element = scanner.nextInt();
            tos++;
            STK[tos] = element;
        }

    }

    public void pop() {
        if (tos == -1) {
            System.out.println("Stack is empty ! ");
        } else {
            int poped;
            poped = STK[tos--];
            System.out.println("Poped element is : " + poped);
        }
    }

    public void Display() {
        if (tos == -1) {
            System.out.println("Stack is empty !");
            return;
        } else {
            for (int i = tos; i >= 0; i--) {
                System.out.println("Element is : " + STK[i]);
            }
        }
    }

    public void Peek() {
        if (tos == -1) {
            System.out.println("Stack is empty !");
        } else {
            System.out.println("The peek element in stack is : " + STK[tos]);
        }

    }

    public int Length() {
        int count = 0;
        if (tos == -1) {
            System.out.println("Stack is empty !");
        }
        tos++;
        return count++;

    }

    public static void main(String[] args) {
        StackUsingArray stk = new StackUsingArray();
        int choice;
        /*
        Website 
        579415153841
        18094

        Data Analysis
        133041494212
        53505
        
        Project Management
        769389843581
        82686
        
        */
        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1-Push");
            System.out.println("2-Pop");
            System.out.println("3-Display");
            System.out.println("4-Peek");
            System.out.println("5-Length");
            System.out.println("6-Exit");
            System.out.println("-------------------------------------\n");
            System.out.println("Enter the choice : ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println("-------------------------------------\n");
            switch (choice) {
                case 1:
                    stk.push();
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.Display();
                    break;
                case 4:
                    stk.Peek();
                    break;
                case 5:
                    int findLength = stk.Length();
                    System.out.println("Length is = " + findLength);
                    break;
                case 6:
                    System.out.println("Exitting...!");
                    return;
                default:
                    System.out.println("Invalid Choice !\n\n");
            }
        }

    }

}
