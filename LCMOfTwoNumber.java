import java.util.*;

public class LCMOfTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number2 : ");
        int num2 = scanner.nextInt();
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        System.out.println("GCD of Two number is : " + num1);
        System.out.println("\n\n");
        System.out.println("------------Finding LCM using GCD--------------\n");
        System.out.println("Enter number1 : ");
        int num3 = scanner.nextInt();
        System.out.println("Enter number2 : ");
        int num4 = scanner.nextInt();
        int LCM;
        LCM = (num3 * num4) / num1;
        System.out.println("LCM of number " + num3 + " and number " + num4 + " is = " + LCM);

    }
}
