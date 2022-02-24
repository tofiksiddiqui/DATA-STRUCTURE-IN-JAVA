import java.util.*;

public class PatternUsingSwitch {
    Scanner scanner = new Scanner(System.in);

    public void Patter1() {
        System.out.println("----------Pattern1------------ ");
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

    }

    public void Pattern2() {
        System.out.println("-----------Pattern2----------\n");
        System.out.println("Enter number of rows : ");
        int rows1 = scanner.nextInt();
        System.out.println("-------------------------");

        for (int i = 1; i <= rows1; i++) {
            for (int j = rows1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void Pattern3() {
        System.out.println("------Pattern3-------");
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
    }

    public void Pattern4() {
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
    }

    public void Pattern5() {
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
    }

    public void Pattern6() {
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
    }

    public void Pattern7() {
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
    }

    public void Pattern8() {
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
    }

    public void Pattern9() {
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
    }

    public void Pattern10() {
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
    }

    public void Pattern11() {
        System.out.println("------------------------Pattern-11----------------");
        System.out.println("Enter the number : ");
        int r1 = scanner.nextInt();
        for (int i = 1; i <= r1; i++) {
            for (int j = 1; j <= i; j++) {
                if (i >= 2 && j <= (i - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        for (int i = 1; i <= r1; i++) {
            for (int sp1 = r1; sp1 >= i; sp1--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i >= 2 && j > 1) {
                    System.out.print("");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void Pattern12() {
        System.out.println("--------------Pattern-12-----------------");
        System.out.println("Enter the number : ");
        int r2 = scanner.nextInt();
        System.out.println("-------------------------");

        for (int i = 1; i <= r2; i++) {
            for (int space1 = r2; space1 >= i; space1--) {
                System.out.print(" ");
            }
            for (int j = 1; j < (i * 2); j++) {
                if (j > 1 && j < (i * 2 - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }

    public void Pattern13() {
        System.out.println("--------------Pattern-13---------------");
        System.out.println("Enter the number : ");
        int r3 = scanner.nextInt();
        System.out.println("-------------------------------------");
        for (int i = r3; i >= 1; i--) {
            for (int sp = r3; sp > i; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j < (i * 2); j++) {
                if (j > 1 && j < (i * 2 - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PatternUsingSwitch ptn = new PatternUsingSwitch();
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("------------------------------");
            System.out.println("1-Pattern1");
            System.out.println("2-Pattern2");
            System.out.println("3-Pattern3");
            System.out.println("4-Pattern4");
            System.out.println("5-Pattern5");
            System.out.println("6-Pattern6");
            System.out.println("7-Pattern7");
            System.out.println("8-Pattern8");
            System.out.println("9-Pattern9");
            System.out.println("10-Pattern10");
            System.out.println("11-Pattern11");
            System.out.println("12-Pattern12");
            System.out.println("13-Pattern13");
            System.out.println("14-Exit");
            System.out.println("------------------------------");
            System.out.print("Enter the Choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ptn.Patter1();
                    break;
                case 2:
                    ptn.Pattern2();
                    break;
                case 3:
                    ptn.Pattern3();
                    break;
                case 4:
                    ptn.Pattern4();
                    break;
                case 5:
                    ptn.Pattern5();
                    break;
                case 6:
                    ptn.Pattern6();
                    break;
                case 7:
                    ptn.Pattern7();
                    break;
                case 8:
                    ptn.Pattern8();
                    break;
                case 9:
                    ptn.Pattern9();
                    break;
                case 10:
                    ptn.Pattern10();
                    break;
                case 11:
                    ptn.Pattern11();
                    break;
                case 12:
                    ptn.Pattern12();
                    break;
                case 13:
                    ptn.Pattern13();
                    break;
                case 14:
                    System.out.println("Exitting...\n\n");
                    return;
                default:
                    System.out.println("Invalid choice !");
                    break;

            }

        }

    }

}
