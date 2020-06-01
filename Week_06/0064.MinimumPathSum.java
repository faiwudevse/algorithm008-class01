/*
time complexity: O(2^(m + n))
space complexity: O(m + n)
thought process: Brute Force
*/
class Solution {
    public int minPathSum(int[][] grid) {
        return calcalate(grid, 0 , 0);
    }

    private int calculate(int[][] grid, int t, int j) {
        if (i == grid.length || j == grid[0].length) return Integer.MAX_VALUE;
        if (i == grid.length - 1 && j == grid[0].length - 1) return grid[i][j];
        return grid[i][j] + Math.min(calculate(grid, i + 1, j) ,calculate(grid, i, j + 1));
    }
}

/*
time complexity: O(mn)
space complexity: O(mn)
thought process:  Dynamic Programming
*/
class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];

        for(int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {

                // when point is in the last row
                if (i == grid.length - 1 && j != grid[0].length - 1)
                    dp[i][j] = grid[i][j] + dp[i][j + 1];
                
                // when point is in the last column  
                else if (j == grid[0].length - 1 && i != grid.length - 1)
                    dp[i][j] = grid[i][j] + dp[i + 1][j];

                // when point has right and down grid
                else if (j != grid[0].length - 1 && i != grid.length - 1)
                    dp[i][j] = grid[i][j] + Math.min(dp[i + 1][j], dp[i][j+1]);

                // when point is in the end point
                else 
                    dp[i][j] = grid[i][j];
            }
        }

        return dp[0][0];
    }
}