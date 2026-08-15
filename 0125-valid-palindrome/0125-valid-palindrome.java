class Solution {
    public boolean isPalindrome(String s) {
        return check(s,0,s.length()-1);
    }
    private boolean check(String s,int left,int right){
        if(left>=right){
            return true;
        }
        if(!Character.isLetterOrDigit(s.charAt(left))){
            return check(s,left+1,right);
        }
        if(!Character.isLetterOrDigit(s.charAt(right))){
            return check(s,left,right-1);
        }
        if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
            return false;
        }
        return check(s, left + 1, right - 1);
    }
}