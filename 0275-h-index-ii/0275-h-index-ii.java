class Solution {
    public int hIndex(int[]arr){
        int n = arr.length;
        int ans = 0;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>=n-mid){
                ans = n-mid;
                end = mid-1;
            }
            else{
                start = mid+1;             
            }
        }
        return ans;
        
    }
}