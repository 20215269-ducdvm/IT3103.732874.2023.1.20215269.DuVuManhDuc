package Lab01;

public class AddTwoMatrices {
    private static final int SIZE = 6;
    public static void print(int [][]matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][]matrixA = new int[SIZE][SIZE];
        int [][]matrixB = new int[SIZE][SIZE];
        int [][]matrixC = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrixA[i][j] = i + j;
                matrixB[i][j] = i * j;
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("First matrix:");
        print(matrixA);

        System.out.println("Second matrix:");
        print(matrixB);

        System.out.println("Sum of the two:");
        print(matrixC);
    }
}
