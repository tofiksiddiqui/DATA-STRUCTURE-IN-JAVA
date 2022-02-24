import java.util.*;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array1 : ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Enter an item : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Array's item are : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Enter the size of Second array : ");
        n = scanner.nextInt();
        int a1[] = new int[n - 1];
        int j = 0;
        System.out.println("The element of array where the duplicate item has been removed :");
        for (int i = 0; i < a1.length; i++) {
            if (a[i] != a[i + 1]) {
                a1[j] = a[i];
                j++;
            }
            a1[j] = a[n - 1];
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
        for (int i = 0; i < (a1.length - 1); i++) {
            for (j = 0; j < (a1.length - i - 1); j++) {
                if (a1[j] > a1[j + 1]) {
                    int temp = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array is : ");
        for(int i =0; i<a1.length;i++){
            System.out.println(a1[i]);
        }
    }
}
