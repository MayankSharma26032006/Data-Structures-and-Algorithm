class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0;
        int j = 0;
        int ways = 0;
        while(j<trainers.length){
            if(i<players.length&&players[i]<=trainers[j]){
                ways++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return ways;
        
    }
}