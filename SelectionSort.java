import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int min;
        int i;
        int j;
        int temp;
        System.out.println("Enter the size of Item : ");
        n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Items : ");
        for (i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Before sorting : ");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        for (i = 0; i < n - 1; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        System.out.println("After sorting : ");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
