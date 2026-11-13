class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int point = -1;

        for(int i = arr.length-1;i>0;i--){
            if(arr[i-1]<arr[i]){
                point = i-1;
                break;
            }
        }

        if(point==-1)return -1;

        for(int j = arr.length-1;j>point;j--){
            if(arr[j]>arr[point]){
                swap(arr,point,j);
                break;
            }
        }

        reverse(arr,point+1,arr.length-1);
        long ans = Long.parseLong(new String(arr));

        if(ans>Integer.MAX_VALUE)return -1;

        return (int)ans;
    }

    public void swap(char[] arr,int i,int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(char[] arr,int left,int right) {
        while(left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }
}