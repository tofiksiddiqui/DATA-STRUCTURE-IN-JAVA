import java.util.*;

public class AddTwoInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num1 = sc.nextInt();
        int arr[] = new int[num1];
        System.out.println("Enter the number : ");
        for (int i = 0; i < num1; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < num1; i++) {
            if (arr[i] < arr[i + 1]) {
                arr[i] = arr[i + 1];
            }
        }
        System.out.println(arr[0]);
        

    }
}