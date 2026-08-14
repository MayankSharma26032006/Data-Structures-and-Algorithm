class Solution {
    public int findLHS(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max = 0;
        for(int num:map.keySet()){
            if(map.containsKey(num+1)){
                max = Math.max(max,map.get(num)+map.get(num+1));
            }
        }
        return max;
        
    }
}