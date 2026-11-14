class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int mod = 12345;
        int[][]pre = new int[m][n];
        int[][]suff = new int[m][n];
        int[][]ans = new int[m][n];
        long product = 1;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                pre[i][j] = (int) product; 
                product = (product * grid[i][j]) % mod;
            }
        }
        product = 1;
        for(int i = m-1;i>=0;i--){
            for(int j = n-1;j>=0;j--){
                suff[i][j] = (int) product;
                product = (product * grid[i][j]) % mod;
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                ans[i][j] = (int)((long)pre[i][j] * suff[i][j] % mod);
            }
        }
        return ans;
    }
}