class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st = new Stack<>();
        for(String num:tokens){
            if(num.equals("+")){
                int b = st.pop();
                int a = st.pop();
                st.push(a+b);
            }
            else if(num.equals("-")){
                int b = st.pop();
                int a = st.pop();
                st.push(a-b);
            }
            else if(num.equals("*")){
                int b = st.pop();
                int a = st.pop();
                st.push(a*b);
            }
            else if(num.equals("/")){
                int b = st.pop();
                int a = st.pop();
                st.push(a/b);
            }
            else{
                st.push(Integer.parseInt(num));
            }
        }
        return st.peek();
        
    }
}