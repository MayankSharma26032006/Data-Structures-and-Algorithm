class Solution {
    public int longestOnes(int[] arr, int k){
        int left = 0;
        int zero = 0;
        int max = 0;
        for(int right = 0;right<arr.length;right++){
            if(arr[right]==0){
                zero++;
            }
            while(zero>k){
                if(arr[left]==0){
                    zero--;
                }
                left++;
            }
            max = Math.max(max,right-left+1);

        }
        return max;
        
    }
}