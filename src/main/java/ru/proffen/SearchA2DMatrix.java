package ru.proffen;

import java.util.SortedMap;

public class SearchA2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row;


        int start = 0;
        int end = matrix.length - 1;


        while (start <= end) {



            int mid = start + (end - start) / 2;


            //System.out.println("Current: [" + start + ", " + end + "], mid is " + mid);

            if (target >= matrix[mid][0] && target <= matrix[mid][matrix[mid].length - 1]) {
                row = mid;

                //System.out.println("Target can be in row " + row);

                start = 0;
                end = matrix[row].length - 1;
                while (start <= end) {
                    mid = start + (end - start) / 2;
                    if (target < matrix[row][mid]) {
                        end = mid - 1;
                    } else if (target > matrix[row][mid]) {
                        start = mid + 1;
                    } else {
                        return true;
                    }
                }
            } else if (target < matrix[mid][0]) {
                end = mid - 1;
            } else if ((target > matrix[mid][matrix[mid].length - 1])) {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3}};
        int target = 2;
        System.out.println(searchMatrix(matrix, target));
    }
}
