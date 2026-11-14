class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[]num:dp){
            Arrays.fill(num,-1);
        }
        return path(grid,0,0,dp);
    }
    public int path(int[][]grid,int i,int j,int[][]dp){
        if(i>=grid.length||j>=grid[0].length)return Integer.MAX_VALUE;
        if(i==grid.length-1&&j==grid[0].length-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1)return dp[i][j];
        int right = path(grid,i,j+1,dp);
        int down = path(grid,i+1,j,dp);
        return dp[i][j] = grid[i][j]+Math.min(right,down);

    }
}