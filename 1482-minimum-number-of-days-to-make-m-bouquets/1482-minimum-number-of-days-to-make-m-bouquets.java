class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int start = bloomDay[0];
        int end = bloomDay[0];
        for(int i = 0;i<bloomDay.length;i++){
            start = Math.min(start,bloomDay[i]);
            end = Math.max(end,bloomDay[i]);
        }
        while(start<end){
            int mid = start+(end-start)/2;
            if(canBloom(bloomDay,m,k,mid)){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;      
    }
    private boolean canBloom(int[]bloomDay,int m,int k,int day){
        int flowers = 0;
        int bouquets = 0;
        for(int bloom : bloomDay) {
            if(bloom <= day) {
                flowers++;

                if(flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            }else{
                flowers = 0;
            }
        }

        return bouquets >= m;

    }
}