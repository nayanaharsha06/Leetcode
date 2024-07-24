class Solution {
    int count = 0;
    public int numIslands(char[][] grid) {
        for(int i = 0; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == '1'){
                    
                    func(grid, i ,j);
                    count++;
                }
            }
        }
        return count;
    }

    public void func(char[][] grid, int i, int j){
        if( i < 0 || j < 0 || j >= grid[0].length || i >= grid.length || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        func(grid, i+1 ,j);
        func(grid, i-1 , j);
        func(grid, i , j+1);
        func(grid, i , j-1);

    }
}