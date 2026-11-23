class Solution {
    public int maxProfit(int k, int[] prices){
        int[][][] dp = new int[prices.length][2][k+1];
        for(int[][]num:dp){
            for(int[]a:num){
                Arrays.fill(a,-1);
            }
        }
        return profit(k,prices,0,0,dp);
    }
    public int profit(int k,int []prices,int i,int bought,int[][][]dp){
        if(i>=prices.length)return 0;
        if(k==0)return 0;
        if(dp[i][bought][k]!=-1)return dp[i][bought][k];
        if(bought==1){
            int keep = profit(k,prices,i+1,1,dp);
            int sell = prices[i]+profit(k-1,prices,i+1,0,dp);
            return dp[i][bought][k] =  Math.max(keep,sell);
        }
        else{
            int buy = -prices[i]+profit(k,prices,i+1,1,dp);
            int notBuy = profit(k,prices,i+1,0,dp);
            return dp[i][bought][k] = Math.max(buy,notBuy);
        }
    }
}