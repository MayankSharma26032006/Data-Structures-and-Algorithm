class Solution {
    public int sumOfBeauties(int[] nums) {
        int n = nums.length;
        int[] rightMin = new int[n];
        rightMin[n-1] = nums[n-1];

        for(int i=n-2;i>=0;i--){
            rightMin[i] = Math.min(nums[i],rightMin[i+1]);
        }
        int leftMax = nums[0];
        int ans = 0;

        for(int i=1;i<n-1;i++){
            if(leftMax < nums[i] && nums[i] < rightMin[i+1]){
                ans += 2;
            }
            else if(nums[i-1] < nums[i] && nums[i] < nums[i+1]){
                ans++;
            }
            leftMax = Math.max(leftMax,nums[i]);
        }
        return ans;

    }

}