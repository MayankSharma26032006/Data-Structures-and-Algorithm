class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int op = 0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int freq:map.values()){
            if(freq==1)return -1;

            if(freq%3==0){
                op+=freq/3;
            }
            else{
                op+=freq/3+1;
            }
        }
        return op;

    }
}