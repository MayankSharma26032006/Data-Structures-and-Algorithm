class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        int pairs = 0;
        while(j<nums.length){
            if(i==j){
                j++;
                continue;
            }
            int temp = nums[j]-nums[i];
            if(temp==k){
                pairs++;
                int a = nums[i];
                int b = nums[j];
                while(i<nums.length && nums[i]==a)i++;
                while(j<nums.length && nums[j]==b)j++;
            }
            else if(temp>k){
                i++;
            }
            else{
                j++;
            }
        }
        return pairs;
    }
}