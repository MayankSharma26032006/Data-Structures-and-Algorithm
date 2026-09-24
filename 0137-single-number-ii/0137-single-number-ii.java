class Solution {
    public int singleNumber(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        for(int num:arr){
            if(map.get(num)==1){
                return num;
            }
        }
        return -1;
    }
}