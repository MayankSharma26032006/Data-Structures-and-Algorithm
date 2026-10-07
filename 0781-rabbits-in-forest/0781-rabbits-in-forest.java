class Solution {
    public int numRabbits(int[] answers) {
        int[] freq = new int[1000];
        for(int x : answers)
            freq[x]++;
        int ans = 0;
        for(int x = 0; x < freq.length; x++) {
            if(freq[x] == 0)
                continue;
            int groupSize = x + 1;
            int groups = (freq[x] + groupSize - 1) / groupSize;
            ans += groups*groupSize;
        }
        return ans;
    }
}