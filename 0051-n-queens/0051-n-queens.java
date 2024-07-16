// Import necessary libraries
import java.util.*;

class Solution {
    // Initialize the result list to store all solutions
    List<List<String>> result = new ArrayList<>();
    
    public List<List<String>> solveNQueens(int n) {
        // Initialize the board with empty cells
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        
        // List to store positions of queens (row, column)
        List<int[]> queens = new ArrayList<>();
        
        // Start DFS to find solutions
        dfs(board, 0, queens);
        
        return result;
    }
    
    // DFS function to recursively place queens
    public void dfs(char[][] board, int row, List<int[]> queens) {
        // Base case: If all queens are placed (valid solution found)
        if (row == board.length) {
            List<String> solution = new ArrayList<>();
            for (char[] rowArray : board) {
                solution.add(new String(rowArray));
            }
            result.add(solution);
            return;
        }
        
        // Try placing queen in each column of current row
        for (int col = 0; col < board.length; col++) {
            if (canPlaceQueen(board, row, col, queens)) {
                // Place queen
                board[row][col] = 'Q';
                queens.add(new int[]{row, col});
                
                // Recursively move to next row
                dfs(board, row + 1, queens);
                
                // Backtrack: Remove queen and try next column
                board[row][col] = '.';
                queens.remove(queens.size() - 1);
            }
        }
    }
    
    // Helper function to check if queen can be placed at (row, col)
    private boolean canPlaceQueen(char[][] board, int row, int col, List<int[]> queens) {
        // Check columns and diagonals for existing queens
        for (int[] queen : queens) {
            int r = queen[0];
            int c = queen[1];
            if (c == col || Math.abs(row - r) == Math.abs(col - c)) {
                return false;
            }
        }
        return true;
    }
}
