class Solution {
    public List<Long> mergeAdjacent(int[] arr) {
        Stack<Long> st = new Stack<>();
        for(int i = 0;i<arr.length;i++){
            long num = arr[i];
            while(!st.isEmpty()&&st.peek()==num){
                num = num+st.pop();
            }
            st.push(num);
        }
        return st;
    }
}