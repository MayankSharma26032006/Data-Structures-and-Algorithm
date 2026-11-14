class Solution {
    public int uniquePaths(int m, int n) {
        int[][]dp = new int[m][n];
        for(int[]num:dp){
            Arrays.fill(num,-1);
        }
        return paths(m,n,0,0,dp);
    }
    public int paths(int m,int n,int i,int j,int[][]dp){
        if(i>=m||j>=n)return 0;
        if(i==m-1&&j==n-1)return 1;
        if(dp[i][j]!=-1)return dp[i][j];       
        int right = paths(m,n,i,j+1,dp);
        int down = paths(m,n,i+1,j,dp);
        return dp[i][j] = right+down;
    }
}