class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        long total = (long)nums.length*(nums.length-1)/2;
        long good = 0;
        for(int i = 0;i<nums.length;i++){
            int temp = nums[i]-i;
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        
        for(int freq:map.values()){
            good+=(long)freq*(freq-1)/2;
        }
        return total-good;
    }
}