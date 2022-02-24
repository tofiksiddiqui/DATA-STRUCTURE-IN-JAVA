import java.util.*;

public class MergingTwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the siz of first array : ");
        int n1 = scanner.nextInt();
        int a[] = new int[n1];
        System.out.println("Enter the items of first array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("The items of first array are : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("\n\n");
        System.out.println("Enter the size of second array : ");
        int n2 = scanner.nextInt();
        int b[] = new int[n2];
        System.out.println("Enter the items of second array : ");
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println("The items of second array are : ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("----------------Merging Both Array In a Single Array----------------------");
        int n3 = n1 + n2;
        int c[] = new int[n3];
        for (int i = 0; i < n1; i++) {
            c[i] = a[i];
        }

        for (int i = 0, j = n1; j < n3 && i < n2; i++, j++) {
            c[j] = b[i];
        }
        System.out.println("The New array's item are : ");
        System.out.println("\n");
        for (int i = 0; i < n3; i++) {
            System.out.println(c[i]);
        }
    }
}
