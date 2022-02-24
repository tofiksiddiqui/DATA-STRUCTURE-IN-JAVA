import java.util.*;

public class FooFunction {
    public static int foo(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            return foo((a - 1), (a - b));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("Enter the first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = scanner.nextInt();
        int d = FooFunction.foo(num1, num2);
        System.out.println("The value of the number is = [ " + d + " ] ");
        System.out.println("--------------------------------------------------");

    }
}
