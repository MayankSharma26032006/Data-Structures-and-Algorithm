class Solution {
    public int firstUniqueFreq(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashMap<Integer,Integer>freq = new HashMap<>();
        for(int num:map.values()){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(freq.get(map.get(num))==1){
                return num;
            }
        }
        return -1;
        
    }
}