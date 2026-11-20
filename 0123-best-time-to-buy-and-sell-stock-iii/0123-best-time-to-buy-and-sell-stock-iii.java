class Solution {
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][3][2];
        for(int[][]num:dp){
            for(int[]a:num){
                Arrays.fill(a,-1);
            }
        }
        return profit(prices,0,2,0,dp);
    }
    public int profit(int[]prices,int i,int cap,int bought,int[][][]dp){
        if(i>=prices.length||cap==0)return 0;
        if(dp[i][cap][bought]!=-1)return dp[i][cap][bought];
        if(bought==1){
            int sell = prices[i]+profit(prices,i+1,cap-1,0,dp);
            int keep = profit(prices,i+1,cap,1,dp);
            return dp[i][cap][bought] = Math.max(sell,keep);
        }
        else{
            int buy = -prices[i]+profit(prices,i+1,cap,1,dp);
            int skip = profit(prices,i+1,cap,0,dp);
            return dp[i][cap][bought] = Math.max(buy,skip);
        }
    }
}