import java.util.*;

public class TransPoseOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp;
        System.out.println("Enter size of rwo : ");
        int rowSize = scanner.nextInt();
        System.out.println("Enter the size of column : ");
        int columnSize = scanner.nextInt();
        int firstMatrix[][] = new int[rowSize][columnSize];
        System.out.println("Enter the First Matrix : ");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                firstMatrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the second matrix : ");
        int secondMatrix[][] = new int[rowSize][columnSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                secondMatrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Addition of two matrix is : ");
        int AddTwoMatrix[][] = new int[rowSize][columnSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                AddTwoMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(AddTwoMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of matrix is : ");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if (i < j) {
                    temp = AddTwoMatrix[i][j];
                    AddTwoMatrix[i][j] = AddTwoMatrix[j][i];
                    AddTwoMatrix[j][i] = temp;
                }
            }
        }
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(AddTwoMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
