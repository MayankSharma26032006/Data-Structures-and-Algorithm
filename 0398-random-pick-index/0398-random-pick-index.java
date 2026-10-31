class Solution {
    HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
    Random rand = new Random();
    public Solution(int[] nums) {
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
    }
    public int pick(int target) {
        ArrayList<Integer> list=map.get(target);
        return list.get(rand.nextInt(list.size()));
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */