class Solution {
    public int numTrees(int n) {
        return unique(n);
    }
    public int unique(int n){
        if(n<=1)return 1;
        int ans = 0;
        for(int i = 1;i<=n;i++){
            int left = unique(i-1);
            int right = unique(n-i);
            ans+=left*right;
        }
        return ans;
    }
}