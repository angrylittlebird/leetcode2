package com.learning._51;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2021/5/30
 * @Description:
 */
public class Solution2 {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        boolean[][] chessBoard = new boolean[n][n];
        solveNQueensHelper(chessBoard, 0);
        return res;
    }

    private void solveNQueensHelper(boolean[][] chessBoard, int row) {
        if (row == chessBoard.length) {
            res.add(squash(chessBoard));
            return;
        }

        for (int i = 0; i < chessBoard.length; i++) {
            if (!isValid(chessBoard, row, i)) continue;

            chessBoard[row][i] = true;

            solveNQueensHelper(chessBoard, row + 1);

            chessBoard[row][i] = false;
        }
    }

    private boolean isValid(boolean[][] chessBoard, int row, int col) {
        // top
        for (int i = 0; i < row; i++) {
            if (chessBoard[i][col]) return false;
        }
        // top left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j]) return false;
        }
        // top right
        for (int i = row - 1, j = col + 1; i >= 0 && j < chessBoard.length; i--, j++) {
            if (chessBoard[i][j]) return false;
        }

        return true;
    }

    public List<String> squash(boolean[][] chessBoard) {
        List<String> res = new ArrayList<>();
        for (boolean[] booleans : chessBoard) {
            StringBuilder sb = new StringBuilder();
            for (boolean isQ : booleans) {
                sb.append(isQ ? "Q" : ".");
            }
            res.add(sb.toString());
        }
        return res;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        List<List<String>> lists = solution.solveNQueens(1);
        System.out.println(lists);

        solution = new Solution2();
        lists = solution.solveNQueens(2);
        System.out.println(lists);

        solution = new Solution2();
        lists = solution.solveNQueens(3);
        System.out.println(lists);

        solution = new Solution2();
        lists = solution.solveNQueens(4);
        System.out.println(lists);
    }
}
