class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total = 0;
        int n = cardPoints.length;
        for(int num:cardPoints){
            total+=num;
        }
        int window = n-k;
        int sum = 0;
        for(int i = 0;i<window;i++){
            sum+=cardPoints[i];
        }
        int minSum = sum;
        for(int i = window;i<n;i++){
            sum+=cardPoints[i]-cardPoints[i-window];
            minSum = Math.min(minSum,sum);
        }
        return total-minSum;
    }
}