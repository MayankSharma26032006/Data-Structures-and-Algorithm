class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = max(piles);
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canEat(piles,mid,h)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;

        
    }
    public int max(int[]piles){
        int maximum = 0;
        for(int i = 0;i<piles.length;i++){
            if(piles[i]>maximum){
                maximum = piles[i];
            }
        }
        return maximum;
    }
    public boolean canEat(int[]piles,int speed,int h){
        long hours = 0;
        for(int i = 0;i<piles.length;i++){
            hours+=(piles[i]+speed-1)/speed;
        }
        return hours<=h;
    }
}