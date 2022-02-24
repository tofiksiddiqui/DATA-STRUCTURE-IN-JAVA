import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of first Array : ");
        int n = scanner.nextInt();
        int[] Array1 = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            Array1[i] = scanner.nextInt();
        }
        System.out.println("Displaying elements of first Array : ");
        for (int i = 0; i < n; i++) {
            System.out.println(Array1[i] + ",");
        }
        System.out.println("\n\n");
        System.out.println("Enter the size of second arrray : ");
        int n1 = scanner.nextInt();
        int[] Array2 = new int[n1 - 1];
        System.out.println("Enter the index where you have to delete that element : ");
        int index = scanner.nextInt();
        for (int i = 0; i < Array1.length; i++) {
            if (i < index) {
                Array2[i] = Array1[i];
            } else if (i == index) {
                continue;
            } else {
                Array2[i - 1] = Array1[i];
            }
        }
        System.out.println("Printing new array's elements where element 30 has been deleted at index 2 : ");
        for (int i = 0; i < (n1 - 1); i++) {
            System.out.println(Array2[i] + ",");
        }

    }

}
