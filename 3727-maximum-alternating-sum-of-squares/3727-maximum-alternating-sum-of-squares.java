class Solution {
    public long maxAlternatingSum(int[] arr) {
        Integer[] nums = new Integer[arr.length];
        for(int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        Arrays.sort(nums, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));

        int n = nums.length;
        long small = 0;
        long big = 0;
        for(int i = 0; i < n / 2; i++) {
            small += (long) nums[i] * nums[i];
        }
        for(int i = n / 2; i < n; i++) {
            big += (long) nums[i] * nums[i];
        }
        return big - small;
    }
}