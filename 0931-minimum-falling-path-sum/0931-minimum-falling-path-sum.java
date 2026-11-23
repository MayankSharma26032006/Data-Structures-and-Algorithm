class Solution {
    public int minFallingPathSum(int[][]matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][]dp = new int[m][n];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(i==0){
                    dp[i][j] = matrix[i][j];
                    continue;
                }
                int top =  i==0?0:dp[i-1][j];
                int leftTop = j==0?Integer.MAX_VALUE: dp[i-1][j-1];
                int rightTop = j==m-1?Integer.MAX_VALUE:dp[i-1][j+1];
                dp[i][j] = matrix[i][j]+Math.min(top,Math.min(leftTop,rightTop));
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int j = 0;j<n;j++){
            ans = Math.min(ans,dp[m-1][j]);
        }
        return ans;
    }
}