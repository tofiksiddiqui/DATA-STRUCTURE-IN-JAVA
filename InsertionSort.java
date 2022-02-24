import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int temp;
        int j;
        int n;
        System.out.println("Enter the size of Item : ");
        n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the number of Items : ");
        for (i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Before sorting : ");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        for (i = 1; i < n; i++) {
            temp = a[i];
            j = i - 1;
            while (j >= 0 && temp < a[j]) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
        }

        System.out.println("After aorting : ");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
