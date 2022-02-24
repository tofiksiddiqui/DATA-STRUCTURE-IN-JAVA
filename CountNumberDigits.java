import java.util.*;

public class CountNumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num1 = scanner.nextInt();
        int count = 0;
        while (num1 != 0) {
            num1 = num1 / 10;
            count++;
        }
        System.out.println("Number of digits are : " + count);

        System.out.println("------Using For Loop---------");
        System.out.println("Enter number : ");
        int num2 = scanner.nextInt();
        int counter = 0;
        for (; num2 != 0; num2 = num2 / 10, counter++) {
        }
        System.out.println("Number of Digits are : " + counter);
    }
}
