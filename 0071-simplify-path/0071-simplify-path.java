class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] arr = path.split("/");
        for(String s : arr) {
            if(s.equals("") || s.equals(".")) {
                continue;
            }
            else if(s.equals("..")) {
                if(!st.isEmpty()) {
                    st.pop();
                }
            }
            else {
                st.push(s);
            }
        }
        String ans = "";

        for(String s : st) {
            ans += "/" + s;
        }

        return ans.isEmpty() ? "/" : ans;
    }
}