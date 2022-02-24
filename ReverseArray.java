import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the item of an array : ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Array before reversing : ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("After reversing : ");
        int temp;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    }
}
