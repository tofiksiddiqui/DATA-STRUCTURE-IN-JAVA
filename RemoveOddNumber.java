import java.util.*;

public class RemoveOddNumber {
    public static void printArray(int a[]) {
        int n = a.length;
        System.out.print("Array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + a[i] + "],");
        }
    }

    public static int[] removeEven(int a[]) {
        int oddCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                oddCount = oddCount + 1;
            }
        }
        int result[] = new int[oddCount];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                result[index] = a[i];
                index++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an items : ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter an items : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        printArray(arr);
        System.out.println("\n");
        System.out.println("After removing even items : \n");
        int result[] = removeEven(arr);
        printArray(result);
        System.out.println("\n\n");
    }
}
