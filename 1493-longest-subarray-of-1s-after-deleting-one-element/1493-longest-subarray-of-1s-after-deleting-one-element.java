class Solution {
    public int longestSubarray(int[]arr){
        int left = 0;
        int zero = 0;
        int ans = 0;
        for(int right = 0;right<arr.length;right++){
            if(arr[right]==0){
                zero++;
            }
            while(zero>1){
                if(arr[left]==0){
                    zero--;
                }
                left++;
            }
            ans = Math.max(ans,right-left);
        }
        return ans;
        
    }
}