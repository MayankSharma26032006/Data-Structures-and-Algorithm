class Solution {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];
        for(int[] num:dp) Arrays.fill(num,-1);
        return profit(prices,fee,0,0,dp);
    }
    public int profit(int[]prices,int fee,int i,int bought,int[][]dp){
        if(i>=prices.length)return 0;
        if(dp[i][bought]!=-1)return dp[i][bought];
        if(bought==1){
            int keep = profit(prices,fee,i+1,1,dp);
            int sell = prices[i]+profit(prices,fee,i+1,0,dp);
            return dp[i][bought] = Math.max(keep,sell);
        }
        else{
            int buy = -prices[i]-fee+profit(prices,fee,i+1,1,dp);
            int notBuy = profit(prices,fee,i+1,0,dp);
            return dp[i][bought] = Math.max(buy,notBuy);
        }
        
    }

}