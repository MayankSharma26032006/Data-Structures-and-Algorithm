class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int start = matrix[0][0];
        int end = matrix[n-1][n-1];
        while(start<=end){
            int count = 0;
            int mid = start+(end-start)/2;
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    if(matrix[i][j]<=mid){
                        count++;
                    }
                }
            }
            if(count<k){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }
}