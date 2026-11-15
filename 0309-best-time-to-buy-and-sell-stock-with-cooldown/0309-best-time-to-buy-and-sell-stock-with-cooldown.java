class Solution {
    public int maxProfit(int[] prices) {
        int[][]dp = new int[prices.length][2];
        for(int[]num:dp){
            Arrays.fill(num,-1);
        }
        return profit(prices,0,0,dp);
    }
    public int profit(int[]prices,int idx,int bought,int[][]dp){
        if(idx>=prices.length)return 0;
        if(dp[idx][bought]!=-1)return dp[idx][bought];
        if(bought==1){
            int sell = prices[idx]+profit(prices,idx+2,0,dp);
            int keep = profit(prices,idx+1,1,dp);
            return dp[idx][bought] = Math.max(sell,keep);
        }
        else{
            int buy = -prices[idx]+profit(prices,idx+1,1,dp);
            int skip = profit(prices,idx+1,0,dp);
            return dp[idx][bought] = Math.max(buy,skip);
        }

    }
}