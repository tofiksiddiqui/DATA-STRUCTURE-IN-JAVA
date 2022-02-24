import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int i;
        System.out.print("Enter the size of elements : ");
        int n = scanner.nextInt();
        System.out.print("Enter the lements : ");
        int[] a = new int[n];
        for (i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for (i = 0; i < a.length; i++) {
            System.out.println("Elements are : " + a[i]);
        }

        System.out.println("\n\n");
        System.out.print("Enter the element to be searched : ");
        int itemSearch = scanner.nextInt();
        for (i = 0; i < a.length; i++) {
            if (a[i] == itemSearch) {
                count++;
                break;
            }
        }
        if (count > 0) {
            System.out.println("The item exist is : " + itemSearch + "\t At location : " + i + "\tCount is " + count);
        } else {
            System.out.println("Item is not present in array\n");
        }
        System.out.println("\n\n");
    }

}
