import java.util.*;

public class FindSecondLargestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int i;
        int firstLargest = 0;
        int secondLargest = 0;
        System.out.println("Enter the size of items : ");
        n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the items : ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Originar array : \n");
        for (i = 0; i < arr.length; i++) {
            System.out.println("[" + arr[i] + "],");
        }

        /**
         * Finding First and Second Largest Value
         */
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < firstLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("First Largest value is : " + firstLargest);
        System.out.println("Second Largest is : " + secondLargest);

    }
}
