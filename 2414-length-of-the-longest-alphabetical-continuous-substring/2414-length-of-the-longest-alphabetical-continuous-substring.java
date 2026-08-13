class Solution {
    public int longestContinuousSubstring(String s) {
        int len = 1;
        int max = 1;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)+1){
                len++;
                max = Math.max(max,len);
            }
            else{
                len = 1;
            }
        }
        return max;
        
    }
}