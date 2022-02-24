import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        int n;
        int count = 0;
        String temp;
        System.out.println("Entet the size of item : ");
        n = scanner.nextInt();
        System.out.println("Enter the number of items : ");
        String names[] = new String[n];
        for (i = 0; i < names.length; i++) {
            names[i] = scanner.next();
        }
        System.out.println("Printing before sorting : ");
        for (i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("Enter the name to be search : ");
        String itemString = scanner.next();
        for (i = 0; i < names.length; i++) {
            if (names[i] == itemString) {
                count++;
                break;
            }
        }
        if (count > 0) {
            System.out.println("Item is found : " + itemString + "\tAt location : " + i + "\tAnd count is : " + count);
        } else {
            System.out.println("Item is not present in list !");
        }

        for (i = 0; i < (names.length - 1); i++) {
            for (j = 0; j < (names.length - i - 1); j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        System.out.println("Printing after sorting : ");
        for (i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
