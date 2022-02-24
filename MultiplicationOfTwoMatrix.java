import java.util.*;

public class MultiplicationOfTwoMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        System.out.println("Multiplication of two matrix is : ");
        int MulTwoMatrix[][] = new int[rowSize][columnSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                MulTwoMatrix[i][j] = 0;
                for (int k = 0; k < rowSize; k++) {
                    MulTwoMatrix[i][j] = MulTwoMatrix[i][j] + firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(MulTwoMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
