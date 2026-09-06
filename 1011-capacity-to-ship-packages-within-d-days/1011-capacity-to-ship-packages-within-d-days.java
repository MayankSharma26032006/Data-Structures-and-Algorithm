class Solution {
    public int shipWithinDays(int[] weights, int days){
        int sum = 0;
        int start = 0;
        for(int i = 0;i<weights.length;i++){
            start = Math.max(start,weights[i]);
            sum+=weights[i];
        }
        
        int end = sum;
        int ans = sum;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isCapacity(weights,days,mid)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
        
    }
    public static boolean isCapacity(int[]weights,int days,int capacity){
        int load = 0;
        int day = 1;
        for(int i = 0;i<weights.length;i++){
            if(load+weights[i]>capacity){
                day++;
                load = 0;
            }
            load +=weights[i];
        }
        if(day<=days){
            return true;
        }
        return false;
    }

}