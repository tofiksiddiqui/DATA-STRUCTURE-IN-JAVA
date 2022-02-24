import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num1 = scanner.nextInt();
        int OriginalNum = num1;
        int reversedNumber = 0;
        while (OriginalNum != 0) {
            int rem = OriginalNum % 10;
            reversedNumber = reversedNumber * 10 + rem;
            OriginalNum = OriginalNum / 10;
        }
        if (num1 == reversedNumber) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }
    }
}
