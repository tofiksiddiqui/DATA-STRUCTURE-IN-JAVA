import java.util.Scanner;

public class ArrayCreationTraversalCopy {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int newValue;
        System.out.print("Enter the size of First Array : ");
        int n = scanner.nextInt();
        int[] Array1 = new int[n];
        System.out.print("Enter the elements : ");
        for (i = 0; i < n; i++) {
            Array1[i] = scanner.nextInt();
        }
        System.out.print("Displaying first Array's Element : ");
        for (i = 0; i < n; i++) {
            System.out.print(Array1[i] + ",");
        }
        System.out.println("\n");
        /*
         * Now we have to add element 80 at position 2 in previus array without deleting
         * that array
         */
        System.out.print("Enter the size of second array : ");
        int b = scanner.nextInt();
        int[] Array2 = new int[b + 1];
        System.out.print("Enter the index of value to be inserted : ");
        int index = scanner.nextInt();
        System.out.print("Enter the new element to be inerted : ");
        newValue = scanner.nextInt();
        scanner.close();
        for (i = 0; i < (b + 1); i++) {
            if (i < index) {
                Array2[i] = Array1[i]; // here only elemetns 10,20 will be copied to second array
            } else if (i == index) {
                Array2[i] = newValue;
            } else {
                Array2[i] = Array1[i - 1];
            }
        }
        System.out.print("Elements of new array is : ");
        for (i = 0; i < (b + 1); i++) {
            System.out.print(Array2[i] + ",");
        }
        System.out.println("\n\n\n");
    }

}
