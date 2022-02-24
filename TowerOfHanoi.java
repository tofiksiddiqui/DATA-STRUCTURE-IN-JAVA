
/**
 * For N disc Move :
 * 1 - 3
 * 1 - 2
 * 3 - 2
 * 1 - 3
 * 2 - 1
 * 2 - 3
 * 1 - 3
 */

import java.util.*;

class MyHanoi {
    public static void Hanoi(int n, int A, int B, int C) {
        int i;
        if (n > 0) {
            Hanoi((n - 1), A, C, B);
            System.out.println("Moved from [ " + A + " ]  to [ " + C + " ]");
            Hanoi((n - 1), B, A, C);
        }
    }
}

class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.print("Enter the number of Disc : ");
        int n = scanner.nextInt();
        System.out.println("\n");
        MyHanoi.Hanoi(n, 1, 2, 3);
        System.out.println("---------------------------------------------------\n\n");

    }
}