class Solution2 {
    
    public int dfs(int[][] grid, int i, int j) {
        // break condition
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0) {
            return 0;
        }
        else {
            // make it 0 or visited
            grid[i][j] = 0;
            return (1 + dfs(grid, i-1, j) + dfs(grid, i+1, j) + dfs(grid, i, j-1) + dfs(grid, i, j+1));
        }
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            int count = 0;
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    count = dfs(grid, i, j);
                    if(count > res) res = count;
                }
            }
        }
        return res;
    }
}
