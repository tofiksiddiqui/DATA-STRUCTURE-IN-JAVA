import java.util.*;

public class MergingElementAlternativelyArray {
    public static void main(String[] args) {
        int a[] = new int[100];
        int b[] = new int[100];
        int m = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array1: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the items : ");
        for (int i = 0; i < 6; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter the size of array2 : ");
        int n2 = scanner.nextInt();
        System.out.println("Enter the items : ");
        for (int i = 0; i < 6; i++) {
            b[i] = scanner.nextInt();
        }
        int k = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = m; j >= k; j--) {
                a[j + 1] = a[j];
            }
            a[k] = b[i];
            k = k + 2;
            m++;
        }
        System.out.println("New array is : ");
        for (int i = 0; i < 12; i++) {
            System.out.println(a[i]);
        }
    }
}
