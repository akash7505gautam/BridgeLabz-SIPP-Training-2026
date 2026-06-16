import java.util.Random;

public class MatrixAdvancedOperations {

    // Create Random Matrix
    public static int[][] createRandomMatrix(int rows, int cols) {

        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(9) + 1;
            }
        }

        return matrix;
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

    // Display Double Matrix
    public static void displayDoubleMatrix(double[][] matrix) {

        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f\t", value);
            }
            System.out.println();
        }
    }

    // Transpose
    public static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Determinant 2x2
    public static int determinant2x2(int[][] m) {

        return (m[0][0] * m[1][1])
             - (m[0][1] * m[1][0]);
    }

    // Determinant 3x3
    public static int determinant3x3(int[][] m) {

        return m[0][0] * (
                m[1][1] * m[2][2]
              - m[1][2] * m[2][1])

             - m[0][1] * (
                m[1][0] * m[2][2]
              - m[1][2] * m[2][0])

             + m[0][2] * (
                m[1][0] * m[2][1]
              - m[1][1] * m[2][0]);
    }

    // Inverse 2x2
    public static double[][] inverse2x2(int[][] m) {

        int det = determinant2x2(m);

        if (det == 0) {
            return null;
        }

        double[][] inv = new double[2][2];

        inv[0][0] = (double) m[1][1] / det;
        inv[0][1] = -(double) m[0][1] / det;
        inv[1][0] = -(double) m[1][0] / det;
        inv[1][1] = (double) m[0][0] / det;

        return inv;
    }

    // Inverse 3x3
    public static double[][] inverse3x3(int[][] m) {

        int det = determinant3x3(m);

        if (det == 0) {
            return null;
        }

        double[][] adj = new double[3][3];

        adj[0][0] = (m[1][1] * m[2][2] - m[1][2] * m[2][1]);
        adj[0][1] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]);
        adj[0][2] = (m[1][0] * m[2][1] - m[1][1] * m[2][0]);

        adj[1][0] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]);
        adj[1][1] = (m[0][0] * m[2][2] - m[0][2] * m[2][0]);
        adj[1][2] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]);

        adj[2][0] = (m[0][1] * m[1][2] - m[0][2] * m[1][1]);
        adj[2][1] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]);
        adj[2][2] = (m[0][0] * m[1][1] - m[0][1] * m[1][0]);

        double[][] inverse = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adj[j][i] / det;
            }
        }

        return inverse;
    }

    public static void main(String[] args) {

        // 3x3 Matrix
        int[][] matrix3 = createRandomMatrix(3, 3);

        System.out.println("Original Matrix:");
        displayMatrix(matrix3);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix3));

        System.out.println("\nDeterminant (3x3): "
                + determinant3x3(matrix3));

        double[][] inverse3 = inverse3x3(matrix3);

        if (inverse3 != null) {
            System.out.println("\nInverse (3x3):");
            displayDoubleMatrix(inverse3);
        } else {
            System.out.println("\nInverse not possible.");
        }

        // 2x2 Matrix
        int[][] matrix2 = createRandomMatrix(2, 2);

        System.out.println("\n\n2x2 Matrix:");
        displayMatrix(matrix2);

        System.out.println("\nDeterminant (2x2): "
                + determinant2x2(matrix2));

        double[][] inverse2 = inverse2x2(matrix2);

        if (inverse2 != null) {
            System.out.println("\nInverse (2x2):");
            displayDoubleMatrix(inverse2);
        } else {
            System.out.println("\nInverse not possible.");
        }
    }
}