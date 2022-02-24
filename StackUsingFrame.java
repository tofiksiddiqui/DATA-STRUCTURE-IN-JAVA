import java.util.Stack;
import java.util.Scanner;
public class StackUsingFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        stk.push(60);
        System.out.println("Elements are : " + stk);
        System.out.println("Element poped : " + stk.pop());
        stk.clear();
        System.out.println("Element are : " + stk);
        System.out.println("Enter the size : ");
        int arraySize = scanner.nextInt();
        System.out.println("Enter the element : ");
        int element;
        for (int i = 0; i < arraySize; i++) {
            element = scanner.nextInt();
            stk.push(element);
        }
        System.out.println("Element are : " + stk);
        System.out.println("Top element is : " + stk.peek());
        System.out.println("Poping the elements : ");
        for (int i = 0; i < stk.size(); i++) {
            System.out.println("Poped element is : " + stk.get(i));
            stk.pop();
        }

    }

}
