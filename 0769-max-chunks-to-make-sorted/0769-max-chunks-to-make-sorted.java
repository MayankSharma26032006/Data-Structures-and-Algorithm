class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            if(max==i){
                count++;
            }
        }
        return count;
    }
}