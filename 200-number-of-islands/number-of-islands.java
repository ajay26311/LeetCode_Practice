class Solution {
    public int numIslands(char[][] grid) {

       int count = 0;
       int rows = grid.length;
       int cols = grid[0].length;

       for(int i = 0; i < rows; i++)
       {
            for(int j = 0; j < cols; j++)
            {
                if(grid[i][j] == '1')
                {
                    count++;
                    dfs(grid, i, j);
                }
            }
       } 
       return count;
    }

    public void dfs(char grid[][], int i, int j)
    {
        int rows = grid.length;
        int cols = grid[0].length;

        //boundary check + water check
        if(i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0')
        {
            return;
        }

        // mark visited
        grid[i][j] = '0';

        // explore four direction
        dfs(grid, i + 1, j);     //down
        dfs(grid, i - 1, j);     //up
        dfs(grid, i, j + 1);     // right
        dfs(grid, i, j - 1);     // left
    }
}