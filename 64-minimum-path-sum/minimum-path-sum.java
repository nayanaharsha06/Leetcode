//https://www.youtube.com/watch?v=u26Y7wvOsbk
class Solution {
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];

        // Loop through the grid from the bottom-right corner
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                // Base case: bottom-right corner
                if (i == rows - 1 && j == cols - 1) {
                    dp[i][j] = grid[i][j];
                }
                // Last row: can only move right
                else if (i == rows - 1) {
                    dp[i][j] = grid[i][j] + dp[i][j + 1];
                }
                // Last column: can only move down
                else if (j == cols - 1) {
                    dp[i][j] = grid[i][j] + dp[i + 1][j];
                }
                // Else, take the minimum of moving right or down
                else {
                    dp[i][j] = grid[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        // The answer will be in the top-left corner
        return dp[0][0];
    }
}
