class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k){
        
        int prod= 1;
        int count = 0;
        int left = 0;
        for(int right = 0;right<arr.length;right++){
            prod*=arr[right];
            while(left<arr.length&&prod>=k){
            
                prod/=arr[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
        
    }
}