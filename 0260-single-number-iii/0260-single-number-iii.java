class Solution {
    public int[] singleNumber(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] ans = new int[2];
        int j = 0;
        for(int num:arr){
            if(map.get(num)==1){
                ans[j++] = num;
            }
        }
        return ans;
        
    }
}