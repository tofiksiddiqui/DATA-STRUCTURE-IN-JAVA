import java.util.*;

class FindMissingAndRepeating {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of items : ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the items : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Oringinal Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + arr[i] + "],");
        }
        int i;
        System.out.print("The repeating element is = ");

        for (i = 0; i < arr.length; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                System.out.println(abs_val);
        }

        System.out.print("The missing element is = ");
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                System.out.println(i + 1);
        }
    }
}