class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k){
        return Math.max(find(answerKey,k,'T'),find(answerKey,k,'F'));
        
    }
    private int find(String s,int k,char ch){
        int left = 0;
        int count = 0;
        int ans = 0;
        for(int right = 0;right<s.length();right++){
            if(s.charAt(right)!=ch){
                count++;
            }
            while(count>k){
                if(s.charAt(left)!=ch){
                    count--;
                }
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}