import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        int reversedNumber = 0;
        int rem;
        while (num != 0) {
            rem = num % 10;
            reversedNumber = reversedNumber * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reversed Number is : " + reversedNumber);
       

    }
}
