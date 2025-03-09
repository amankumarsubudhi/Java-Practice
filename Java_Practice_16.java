// Write Java Program to Find the Tranpose of Matrix.

public class Java_Practice_16 {
    static final int M = 3;
    static final int N = 4;

    public static void Transpose_Of_Matrix(int[][] a, int[][] b) {

        int i, j;
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                b[i][j] = a[j][i];
            }
        }

    }

    public static void main(String[] args) {

        int a[][] = { { 11, 12, 13, 14 },
                { 15, 16, 17, 18 },
                { 19, 20, 21, 22 }
        };
        int b[][] = new int[N][M], i, j;

        System.out.println("Displaying The Orginal Matrix = ");
        for (i = 0; i < M; i++) {
            for (j = 0; j < N; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }

        Transpose_Of_Matrix(a, b);

        System.out.println("Transpose Of Matrix = ");

        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
