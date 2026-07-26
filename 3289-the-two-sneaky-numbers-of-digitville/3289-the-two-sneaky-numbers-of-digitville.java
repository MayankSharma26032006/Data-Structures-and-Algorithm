class Solution {
    public int[] getSneakyNumbers(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int[]ans = new int[2]; 
        int idx = 0;    
        for(int num:arr){
            if(set.contains(num)){
                ans[idx++] = num;
            }
            else{
                set.add(num);
            }     
        }
        return ans;
    }
}