package ru.proffen.medium;

public class _0200_NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int numIslands = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    deepSearch(grid, i, j);
                    numIslands++;
                }
            }
        }
        return numIslands;
    }


    private void deepSearch(char[][] grid, int row, int column) {
        if (row < 0 || row >= grid.length || column < 0 || column >= grid[0].length || grid[row][column] == '0') {
            return;
        }
        grid[row][column] = '0';

        deepSearch(grid, row + 1, column);
        deepSearch(grid, row - 1, column);
        deepSearch(grid, row, column + 1);
        deepSearch(grid, row, column - 1);
    }

}
