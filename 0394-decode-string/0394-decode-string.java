class Solution {
    int i = 0;
    public String decodeString(String s) {
        StringBuilder ans = new StringBuilder();
        int num = 0;
        while(i < s.length()) {
            char c = s.charAt(i++);
            if(Character.isDigit(c)) {
                num = num * 10 + c - '0';
            }
            else if(c == '[') {
                String temp = decodeString(s);
                for(int j = 0; j < num; j++)
                    ans.append(temp);
                num = 0;
            }
            else if(c == ']') {
                return ans.toString();
            }
            else {
                ans.append(c);
            }
        }

        return ans.toString();
    }
}