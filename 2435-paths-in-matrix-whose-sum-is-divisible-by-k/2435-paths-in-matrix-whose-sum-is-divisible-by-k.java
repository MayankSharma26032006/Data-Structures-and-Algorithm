class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][]dp = new int[m][n][k]; 
        for(int[][] arr:dp){
            for(int[] num:arr){
                Arrays.fill(num,-1);
            }
        }
        return paths(grid,k,0,0,0,dp);
    }
    public int paths(int[][]grid,int k,int i,int j,int rem,int[][][] dp){
        if(i>=grid.length||j>=grid[0].length)return 0;
        rem = (rem+grid[i][j])%k;
        if(i==grid.length-1&&j==grid[0].length-1){
            if(rem==0)return 1;
            return 0;
        }
        if(dp[i][j][rem]!=-1)return dp[i][j][rem];
        int right = paths(grid,k,i,j+1,rem,dp);
        int down = paths(grid,k,i+1,j,rem,dp);
        return dp[i][j][rem] = (right+down)%1000000007;
    }
}