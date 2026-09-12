class Solution {
    public int[] topKFrequent(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));
        int[] ans = new int[k];
        for(int i = 0;i<k;i++){
            ans[i] = list.get(i);
        }
        return ans;


    }
}