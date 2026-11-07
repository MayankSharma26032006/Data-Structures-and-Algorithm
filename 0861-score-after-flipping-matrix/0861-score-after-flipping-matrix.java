class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            if(grid[i][0] == 0){
                for(int j=0;j<m;j++){
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }
        for(int j=1;j<m;j++){
            int ones = 0;

            for(int i=0;i<n;i++){
                if(grid[i][j] == 1){
                    ones++;
                }
            }

            if(ones < n - ones){
                for(int i=0;i<n;i++){
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }

        int ans = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<m;j++){
                sum = sum * 2 + grid[i][j];
            }
            ans += sum;
        }
        return ans;
    }
}