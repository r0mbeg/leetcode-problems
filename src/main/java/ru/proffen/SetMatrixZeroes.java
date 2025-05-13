package ru.proffen;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//LeetCode 73. Set Matrix Zeroes
public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {

        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {

                    rows.add(i);
                    columns.add(j);

                }
            }
        }

        rows.forEach(i -> Arrays.fill(matrix[i], 0));

        columns.forEach(j -> {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][j] = 0;
            }
        });



    }

    public static void main(String[] args) {



        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        System.out.println(Arrays.deepToString(matrix));
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));






    }


}
