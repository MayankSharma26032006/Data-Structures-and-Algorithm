class Solution {
    public int hIndex(int[]arr){
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0;i<arr.length;i++){
            int h = n-i;
            if(arr[i]>=h){
                return h;
            }
        }
        return 0;
        
    }
}