class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(left!=right){
                return palindrome(s,i,j-1)||palindrome(s,i+1,j);
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean palindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}