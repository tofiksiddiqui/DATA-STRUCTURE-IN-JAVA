import java.util.Scanner;

public class ArrayAddUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of first array : ");
        int n = scanner.nextInt();
        String[] names = new String[n];
        System.out.println("Enter the names : ");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Names are : " + names[i]);
        }
        System.out.println("\n\n");
        System.out.println("Enter the size of second array : ");
        int n1 = scanner.nextInt();
        String[] names1 = new String[n1 + 1];
        System.out.println("Enter the index : ");
        int index = scanner.nextInt();
        System.out.println("Enter the new element : ");
        String string = scanner.next();
        for (int i = 0; i < names1.length; i++) {
            if (i < index) {
                names1[i] = names[i];
            } else if (i == index) {
                names1[i] = string;
            } else {
                names1[i] = names[i - 1];
            }
        }
        for (int i = 0; i < names1.length; i++) {
            System.out.println(names1[i]);
        }
    }

}
