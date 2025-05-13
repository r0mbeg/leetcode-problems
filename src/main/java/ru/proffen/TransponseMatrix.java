package ru.proffen;


//Leetcode 867. Transpose Matrix
public class TransponseMatrix {

    public int[][] transpose(int[][] matrix) {




        int n = matrix.length;
        int m = matrix[0].length;

        int[][] result = new int[m][n];


        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = matrix[i][j];
                result[i][j] = matrix[j][i];
                result[j][i] = temp;
            }
        }

        return result;
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
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        printMatrix(matrix);
        int[][] result = new TransponseMatrix().transpose(matrix);
        printMatrix(result);
    }
}
