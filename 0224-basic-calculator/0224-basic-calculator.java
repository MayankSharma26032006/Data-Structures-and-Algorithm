
class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int num = 0;
        int sign = 1;
        int ans = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10+(ch-'0');
            }
            else if(ch=='+'){
                ans += sign*num;
                num = 0;
                sign = 1;
            }
            else if(ch=='-'){
                ans += sign*num;
                num = 0;
                sign = -1;
            }
            else if(ch=='('){
                st.push(ans);
                st.push(sign);
                ans = 0;
                sign = 1;
            }
            else if(ch==')'){
                ans += sign*num;
                num = 0;
                ans *= st.pop();
                ans += st.pop();
            }
        }
        ans += sign*num;
        return ans;
    }
}
