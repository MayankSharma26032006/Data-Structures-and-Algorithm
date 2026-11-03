class Solution {
    public int minSwaps(String s) {
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                open++;
            } else {
                if(open>0) open--;
                else close++;
            }
        }
        return (close+1)/2;

        
    }
}