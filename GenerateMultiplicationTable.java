import java.util.*;

public abstract class GenerateMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number which you want to multipli : ");
        int num1 = scanner.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println("Multiplication table of [" + num1 + "*" + i + "] is = " + (num1 * i));
            i++;
        }
    }
}
