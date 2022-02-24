import java.util.*;

public class PyramidsAndPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Pyramid------------ ");
        System.out.println("Enter number of rows :");
        int rows = scanner.nextInt();
        System.out.println("-------------------------");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int space = (rows - 1); space >= i; space--) {
                System.out.print("");
            }
        }

        System.out.println("---------Invertes Pyramids------------\n");
        System.out.println("Enter number of rows : ");
        int rows1 = scanner.nextInt();
        System.out.println("-------------------------");

        for (int i = 1; i <= rows1; i++) {
            for (int j = rows1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------Pyramid + inverted pyramid-------");
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        System.out.println("-------------------------");

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------Pattern-4--------");
        System.out.println("Enter the number : ");
        int rows4 = scanner.nextInt();
        System.out.println("-------------------------");

        for (int i = 1; i <= rows4; i++) {
            for (int space = (rows4 - 1); space >= i; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------Pattern-5--------");
        System.out.println("Enter the number :");
        int rows5 = scanner.nextInt();
        System.out.println("-------------------------");

        for (int i = 1; i <= rows5; i++) {
            for (int space = 1; space <= i; space++) {
                System.out.print(" ");
            }
            for (int j = rows5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------Pattern-6---------");
        System.out.println("Enter number : ");
        int rows6 = scanner.nextInt();
        System.out.println("-------------------------");

        for (int i = 1; i <= rows6; i++) {
            for (int space1 = (rows6 - 1); space1 >= i; space1--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= rows6; i++) {
            for (int space2 = 1; space2 <= i; space2++) {
                System.out.print(" ");
            }
            for (int k = (rows6 - 1); k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------Pattern-7-----------------");
        System.out.println("Enter the number : ");
        int rows7 = scanner.nextInt();
        System.out.println("-------------------------");

        for (int i = 1; i <= rows7; i++) {
            for (int space1 = rows7; space1 >= i; space1--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("--------------Pattern-8---------------");
        System.out.println("Enter the number : ");
        int rows8 = scanner.nextInt();
        System.out.println("-------------------------------------");
        for (int i = 1; i <= rows8; i++) {
            for (int space = 1; space <= i; space++) {
                System.out.print(" ");
            }
            for (int j = rows8; j >= i; j--) {
                System.out.print("*");
            }
            for (int k = (rows8 - 1); k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------Pattern-9---------");
        System.out.println("Enter the numbe : ");
        int rows9 = scanner.nextInt();
        System.out.println("-------------------------");

        for (int i = 1; i <= rows9; i++) {
            for (int space1 = (rows9 - 1); space1 >= i; space1--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("------------Pattern-10----------");
        System.out.println("Enter the number  : ");
        int rows10 = scanner.nextInt();
        System.out.println("-------------------------");

        for (int i = 1; i <= rows10; i++) {
            for (int space = 1; space <= i; space++) {
                System.out.print(" ");
            }
            for (int j = rows10; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("\n");
        System.out.println("------------Full pyramid-------------\n");
        System.out.println("Enter the size of number : ");
        int rows2 = scanner.nextInt();
        System.out.println("-------------------------");

        for (int i = 1; i <= rows2; i++) {
            for (int j = 1; j <= (2 * rows2 - 1); j++) {
                if (j >= rows2 - (i - 1) && j <= rows2 + (i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("------------Inverted Full Pyramid-------------\n");
        System.out.println("Enter the size of number : ");
        int rows3 = scanner.nextInt();
        System.out.println("-------------------------");

        for (int i = rows3; i >= 1; i--) {
            for (int space1 = 1; space1 <= rows3 - i; space1++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (i - 1); ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
