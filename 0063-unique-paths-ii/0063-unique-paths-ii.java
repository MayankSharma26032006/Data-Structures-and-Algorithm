class Solution {
    public int uniquePathsWithObstacles(int[][]Grid) {
        int m = Grid.length;
        int n = Grid[0].length;
        int [][]dp = new int[m][n];
        for(int []num:dp){
            Arrays.fill(num,-1);
        }
        return paths(Grid,0,0,m,n,dp);       
    }
    public int paths(int[][]Grid,int i,int j,int m,int n,int[][]dp){
        if(i>=Grid.length||j>=Grid[0].length)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(Grid[i][j]==1)return 0;
        if(i==m-1&&j==n-1)return 1;
        int right = paths(Grid,i,j+1,m,n,dp);
        int down = paths(Grid,i+1,j,m,n,dp);
        return dp[i][j] =  right+down;

    }
}