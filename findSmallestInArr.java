import java.util.*;

public class findSmallestInArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the number : ");
        int arr[] = new int[num1];
        for (int i = 0; i < num1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The sorted number in array is : ");
        for (int i = 0; i < num1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Smallest number in array is : " + arr[0]);
        System.out.println("Geatest number in array is " + arr[arr.length - 1]);

    }
}
