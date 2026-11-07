class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int[]ans = new int[arr.length];
        int n = arr.length;
        Stack<Integer>st = new Stack<>();
        for(int i = 2*n-1;i>=0;i--){
            int idx = i%n;
            while(!st.isEmpty()&&st.peek()<=arr[idx]){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty()){
                    ans[idx] = -1;
                }
                else{
                    ans[idx] = st.peek();
                }
            }
            st.push(arr[idx]);
        }
        return ans;
    }
}