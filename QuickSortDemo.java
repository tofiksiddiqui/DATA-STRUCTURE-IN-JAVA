import java.util.*;

class QuickSort {

    private static void qs(int items[], int left, int right) {
        int i;
        int j;
        int mid;
        int temp;
        i = left;
        j = right;
        mid = items[(left + right) / 2];
        do {
            while ((items[i] < mid) && (i < right))
                i++;
            while ((mid < items[j]) && (j > left))
                j--;
            if (i <= j) {
                temp = items[i];
                items[i] = items[j];
                items[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);
        if (left < j)
            qs(items, left, j);
        if (i < right)
            qs(items, i, right);
    }

    static void qsort(int items[]) {
        qs(items, 0, items.length - 1);

    }
}

class QuickSortDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.print("Enter the size of items : ");
        int numSize = scanner.nextInt();
        int arr[] = new int[numSize];
        System.out.print("Enter the items : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Original Items are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        /**
         * ! Now Sort the Array
         */
        QuickSort.qsort(arr);
        System.out.print("Sorted items are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println("---------------------------------------------\n");

    }
}