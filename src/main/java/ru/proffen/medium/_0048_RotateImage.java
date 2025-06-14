package ru.proffen.medium;


//LeetCode 48. Rotate Image
public class _0048_RotateImage {

    public static void rotate(int[][] matrix) {

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }

    }






    private static void printMatrix(int[][] matrix) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < matrix.length; ++i) {
            str.append("--");
        }
        System.out.println(str);

        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        //int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 8, 7, 6}, {5, 4, 3, 2}};
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        printMatrix(matrix);

        rotate(matrix);


        printMatrix(matrix);


    }

}
