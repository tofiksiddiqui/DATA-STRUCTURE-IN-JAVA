import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Decimal Number : ");
        int decimal = scanner.nextInt();
        int binary = 0;
        int rem = 0;
        int place = 1;
        while (decimal != 0) {
            rem = decimal % 2;
            binary = binary + (rem * place);
            decimal = decimal / 2;
            place = place * 10;
        }
        System.out.println("Binary Number is : " + binary);
    }
}
