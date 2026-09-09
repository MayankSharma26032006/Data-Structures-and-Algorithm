class Solution {
    public int smallestDivisor(int[] arr, int threshold){
        int max = 0;
        int temp = 0;
        for(int i = 0;i<arr.length;i++){
            max = Math.max(arr[i],max);
        }
        int start = 1;
        int end = max;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isAns(arr,threshold,mid)){
                temp = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return temp;
        
    }
    private boolean isAns(int[]arr,int threshold,int mid){
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
            ans+=(arr[i]+mid-1)/mid;
        }
        if(ans<=threshold){
            return true;
        }
        return false;

    }
}