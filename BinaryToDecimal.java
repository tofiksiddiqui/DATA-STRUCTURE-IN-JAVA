import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Binary Number : ");
        int binary = scanner.nextInt();
        int decimal = 0;
        int weight = 1;
        while (binary != 0) {
            int rem = binary % 10;
            decimal = decimal + rem * weight;
            binary = binary / 10;
            weight = weight * 2;
        }
        System.out.println("The converted decimal number is = " + decimal);

    }
}
