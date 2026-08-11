class Solution {
    public int minimumRecolors(String s, int k) {
        int count = 0;
        int ans = 0;
        for(int i = 0;i<k;i++){
            if(s.charAt(i)=='W'){
                count++;
            }
        }
        ans = count;
        for(int i =k;i<s.length();i++){
            if(s.charAt(i)=='W'){
                count++;
            }
            if(s.charAt(i-k)=='W'){
                count--;
            }
            ans = Math.min(ans,count);
        }
        return ans;

        
    }
}