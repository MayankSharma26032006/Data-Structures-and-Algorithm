class Solution {
    public int removeDuplicates(int[]arr){
        int k = 2;
        for(int j = 2;j<arr.length;j++){
            if(arr[j]!=arr[k-2]){
                arr[k] = arr[j];
                k++;
            }
        }
        return k;

        
    }
}