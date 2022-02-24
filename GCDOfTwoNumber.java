import java.util.*;

public class GCDOfTwoNumber {
    static int GCD(int num2, int num3) {
        if (num3 == 0)
            return num2;
        return GCD(num3, num2 % num3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second Number : ");
        int num2 = scanner.nextInt();
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        System.out.println("GCD of tow number is : " + num1);
        System.out.println("--------Using Euclidean Method-----------\n");
        System.out.println("Enter first number : ");
        int num3 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int num4 = scanner.nextInt();
        System.out.println("GCD of two number is = " + GCD(num2, num3));

    }

}
