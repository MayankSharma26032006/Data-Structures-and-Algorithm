class Solution {
    public int[] rotateElements(int[]arr, int k) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>=0){
                list.add(arr[i]);
            }
        }
        int n = list.size();
        if(n==0){
            return arr;
        }
        k%=n;
        reverse(list,0,k-1);
        reverse(list,k,n-1);
        reverse(list,0,n-1);
        
        int j = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>=0){
                arr[i] = list.get(j++);
            }
        }
        return arr;
        
    }
    private void reverse(ArrayList<Integer>list,int a, int b ){
        while(a<b){
            int temp = list.get(a);
            list.set(a,list.get(b));
            list.set(b,temp);
            a++;
            b--;
        }
    }

    
}