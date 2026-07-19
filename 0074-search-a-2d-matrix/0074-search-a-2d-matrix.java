class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = row*col-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int midRow = mid/col;
            int midCol = mid%col;
            if(matrix[midRow][midCol]==target)return true;
            else if(matrix[midRow][midCol]<target){
                start++;
            }
            else{
                end--;
            }
        }
        return false;
        
    }
}