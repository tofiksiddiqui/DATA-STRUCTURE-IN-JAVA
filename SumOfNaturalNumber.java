import java.util.*;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the size of number : ");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of natural number is : " + sum);
        System.out.println("\n\n");
        System.out.println("--------------------Using While loop----------------------------\n");
        System.out.println("Enter number : ");
        int num1 = scanner.nextInt();
        int i = 1;
        int sum1 = 0;
        while (i <= num1) {
            sum1 += i;
            i++;
        }
        System.out.println("Sum of natural number is : " + sum1);
    }

}
