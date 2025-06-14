package ru.proffen.medium;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _0036_ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidSubBoard(board, i, j)) {
                    return false;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i) || !isValidColumn(board, i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidRow (char[][] board, int row) {
        return checkDublicates(board[row]);
    }

    public static boolean isValidColumn (char[][] board, int columnNum) {
        char[] column = new char[9];
        for (int i = 0; i < 9; i++) {
            column[i] = board[i][columnNum];
        }
        return checkDublicates(column);
    }


    public static boolean isValidSubBoard (char[][] board, int i, int j) {
        char[] subBoard = new char[9];
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                subBoard[k * 3 + l] = board[i + k][j + l];
            }
        }

        if (!checkDublicates(subBoard)) {
            System.out.println(subBoard);
        }

        return checkDublicates(subBoard);
    }

    public static boolean checkDublicates (char[] array) {

        List<Character> list = new ArrayList<>();
        for (char c : array) {
            if (c != '.') {
                list.add(c);
            }
        }

        Set<Character> uniqueChars = new HashSet<>(list);



        return uniqueChars.size() == list.size();

    }


    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(board));
    }
}
