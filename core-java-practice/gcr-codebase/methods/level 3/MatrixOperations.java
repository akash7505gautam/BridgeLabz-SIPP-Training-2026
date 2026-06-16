import java.util.Random;

public class MatrixOperations {

    // Create Random Matrix
    public static int[][] createRandomMatrix(int rows, int cols) {

        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // 0 to 9
            }
        }

        return matrix;
    }

    // Add Matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }

    // Subtract Matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        return result;
    }

    // Multiply Matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = B[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < B[0].length; j++) {

                for (int k = 0; k < B.length; k++) {

                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    // Display Matrix
    public static void displayMatrix(int[][] matrix) {

        for (int[] row : matrix) {

            for (int value : row) {
                System.out.print(value + "\t");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;

        int[][] A = createRandomMatrix(rows, cols);
        int[][] B = createRandomMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nAddition:");
        displayMatrix(addMatrices(A, B));

        System.out.println("\nSubtraction:");
        displayMatrix(subtractMatrices(A, B));

        System.out.println("\nMultiplication:");
        displayMatrix(multiplyMatrices(A, B));
    }
}