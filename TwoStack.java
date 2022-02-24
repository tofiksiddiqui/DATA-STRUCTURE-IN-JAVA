import java.util.*;

public class TwoStack {
    int top1 = -1;
    int arrSize = 20;
    int arr[] = new int[arrSize];
    int top2;

    public void push1(int element) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = element;
        } else {
            System.out.println("Stack is full ");
        }
    }

    public void push2(int element) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = element;
        } else {
            System.out.println("Stack is full ");
        }
    }

    public void pop1() {
        if (top1 >= 0) {
            int popedElement;
            popedElement = arr[top1];
            top1--;
            System.out.println(popedElement + "has been poped from stack");
        } else {
            System.out.println("Stack is empty ");
        }
    }

    public void pop2() {
        int popedElement;

        if (top2 < arrSize) {
            popedElement = arr[top2];
            top2--;
            System.out.println(popedElement + "has been poped from stack");

        } else {
            System.out.println("Stack is empty ");
        }
    }

    public void DisplayTop1() {
        int i;
        for (i = top1; i >= 0; i--) {
            System.out.println("Stack element are : " + arr[i]);
        }

    }

    public void DisplayTop2() {
        int i;
        for (i = top2; i < arrSize; i++) {
            System.out.println("Stack element are : " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwoStack stk = new TwoStack();
        while (true) {
            System.out.println("--------------------------");
            System.out.println("1-Push1");
            System.out.println("2-Push2");
            System.out.println("3-Pop1");
            System.out.println("4-Pop2");
            System.out.println("5-Display1");
            System.out.println("6-Display2");
            System.out.println("7-Exit");
            System.out.println("--------------------------");
            System.out.println("Enter the choice :");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Element : ");
                    int element = scanner.nextInt();
                    stk.push1(element);
                    break;
                case 2:
                    System.out.println("Enter the Element : ");
                    int element2 = scanner.nextInt();
                    stk.push2(element2);
                    break;
                case 3:
                    stk.pop1();
                    break;
                case 4:
                    stk.pop2();
                    break;
                case 5:
                    stk.DisplayTop1();
                    break;
                case 6:
                    stk.DisplayTop2();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice !");

            }

        }
    }
}