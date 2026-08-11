class Solution {
    public void sortColors(int[] arr) {
        int start = 0;
        int mid = 0;
        int end = arr.length-1;
        while(mid<=end){
            if(arr[mid]==0){
                int temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                start++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[end];
                arr[end] = arr[mid];
                arr[mid] = temp;
                end--;
            }
        }
        
    }
}