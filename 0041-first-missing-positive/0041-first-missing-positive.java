class Solution {
    public int firstMissingPositive(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(num>0){
                set.add(num);
            }
        }
        int j = 1;
        while(set.contains(j)){
            j++;
        }
        return j;
        
    }
}