class Solution {
    int maxArea= 0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i = 0; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == 1){
                    int area =  func(grid, i ,j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    public int func(int[][] grid, int i, int j){
        if( i < 0 || j < 0 || j >= grid[0].length || i >= grid.length || grid[i][j] == 0){
            return 0;
        }
        grid[i][j] = 0;
        int area = 1;
        area += func(grid, i+1 ,j);
        area += func(grid, i-1 , j);
        area += func(grid, i , j+1);
        area += func(grid, i , j-1);
        return area;
    }
}