class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int addRocks){
        int[]arr = new int[capacity.length];
        int i = 0;
        while(i<capacity.length&&i<rocks.length){
            arr[i] = capacity[i]-rocks[i];
            i++;
        }
        Arrays.sort(arr);
        int ans = 0;
        for(int j = 0;j<arr.length;j++){
            if(arr[j]<=addRocks){
                addRocks-=arr[j];
                ans++;
            }
        }
        return ans;

        
    }
}