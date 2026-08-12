class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for(int right = 0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>=target){
                ans = Math.min(ans,right-left+1);
                sum-=arr[left++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
        
    }
}