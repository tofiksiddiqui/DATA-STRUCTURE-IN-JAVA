import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int i;
        int mid = 0;
        int begin;
        int end;
        int count = 0;
        int itemSearch;

        System.out.print("Enter the size of item : ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of items : ");
        int a[] = new int[n];
        for (i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("\n");
        System.out.print("Iteme are : ");
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Enter the item to be search : ");
        itemSearch = scanner.nextInt();

        begin = 0;
        end = n - 1;
        while (begin < end) {
            mid = (begin + end) / 2;
            if (a[mid] == itemSearch) {
                count++;
                break;
            } else if (itemSearch > a[mid]) {
                begin = mid + 1;
            } else if (itemSearch < a[mid]) {
                end = mid - 1;
            }
        }
        if (count > 0) {
            System.out.println("Item is found : " + itemSearch + "\tAt location : " + mid + "\tAnd count is : " + count);
        } else {
            System.out.println("Item is not present in array : ");
        }
        System.out.println("\n\n");
    }
}
