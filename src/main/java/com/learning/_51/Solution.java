package com.learning._51;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ZHANG
 * @Date: 2021/5/28
 * @Description:
 */
public class Solution {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> chessBoard = initChessBoard(n);

        solveNQueensHelper(chessBoard, 0);

        return res;
    }

    private void solveNQueensHelper(List<List<String>> chessBoard, int row) {
        if (row == chessBoard.size()) {
            res.add(squash(chessBoard));
        }

        for (int i = 0; i < chessBoard.size(); i++) {
            if (!isValid(chessBoard, row, i)) continue;

            chessBoard.get(row).set(i, "Q");

            solveNQueensHelper(chessBoard, row + 1);

            chessBoard.get(row).set(i, ".");
        }
    }

    private boolean isValid(List<List<String>> chessBoard, int row, int col) {
        // top
        for (int i = 0; i < row; i++) {
            if ("Q".equals(chessBoard.get(i).get(col))) return false;
        }
        // top left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if ("Q".equals(chessBoard.get(i).get(j))) return false;
        }
        // top right
        for (int i = row - 1, j = col + 1; i >= 0 && j < chessBoard.size(); i--, j++) {
            if ("Q".equals(chessBoard.get(i).get(j))) return false;
        }

        return true;
    }

    public List<String> squash(List<List<String>> chessBoard) {
        List<String> res = new ArrayList<>();
        for (List<String> strings : chessBoard) {
            res.add(String.join("", strings));
        }
        return res;
    }

    public List<List<String>> initChessBoard(int n) {
        List<List<String>> chessBoard = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<String> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(".");
            }
            chessBoard.add(row);
        }
        return chessBoard;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<String>> lists = solution.solveNQueens(1);
        System.out.println(lists);

        solution = new Solution();
        lists = solution.solveNQueens(2);
        System.out.println(lists);

        solution = new Solution();
        lists = solution.solveNQueens(3);
        System.out.println(lists);

        solution = new Solution();
        lists = solution.solveNQueens(4);
        System.out.println(lists);
    }
}
