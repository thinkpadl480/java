import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter rows and columns for Matrix A: ");
        int aRows = scanner.nextInt(), aCols = scanner.nextInt();
        
        System.out.print("Enter columns for Matrix B: ");
        int bCols = scanner.nextInt();
        
        int[][] A = new int[aRows][aCols];
        int[][] B = new int[aCols][bCols];
        int[][] C = new int[aRows][bCols];

        System.out.println("Matrix A:");
        for (int i = 0; i < aRows; i++)
            for (int j = 0; j < aCols; j++)
                A[i][j] = scanner.nextInt();

        System.out.println("Matrix B:");
        for (int i = 0; i < aCols; i++)
            for (int j = 0; j < bCols; j++)
                B[i][j] = scanner.nextInt();

        for (int i = 0; i < aRows; i++)
            for (int j = 0; j < bCols; j++)
                for (int k = 0; k < aCols; k++)
                    C[i][j] += A[i][k] * B[k][j];

        System.out.println("Resultant Matrix C:");
        for (int[] row : C) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
