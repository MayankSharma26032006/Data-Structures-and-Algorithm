class Solution {
    public boolean checkValidString(String s) {
        int left = 0, right = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ')') left++;
            else if(left > 0) left--;
            else return false;
        }
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != '(') right++;
            else if(right > 0) right--;
            else return false;
        }
        return true;
    }
}