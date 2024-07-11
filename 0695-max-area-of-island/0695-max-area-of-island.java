class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j); // Calculate area of current island
                    maxArea = Math.max(maxArea, area); // Update maxArea if larger area is found
                }
            }
        }
        return maxArea;
    }
    
    private int dfs(int[][] grid, int i, int j) {
        // Base cases for recursion
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        
        // Mark the cell as visited by setting it to 0
        grid[i][j] = 0;
        
        // Calculate area including the current cell and recursively explore neighbors
        int area = 1;
        area += dfs(grid, i + 1, j); // Down
        area += dfs(grid, i - 1, j); // Up
        area += dfs(grid, i, j + 1); // Right
        area += dfs(grid, i, j - 1); // Left
        
        return area;
    }
}
