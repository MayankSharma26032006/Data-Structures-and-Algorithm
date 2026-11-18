class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum = 0;
        for(int num:nums){
            sum += num;
        }
        long left = 0;
        long min = Long.MAX_VALUE;
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            left += nums[i];
            long right = sum-left;
            long avg1 = left/(i+1);
            long avg2 = (i==nums.length-1)?0:right/(nums.length-i-1);

            long diff = Math.abs(avg1-avg2);

            if(diff<min){
                min = diff;
                ans = i;
            }
        }

        return ans;
    }
}