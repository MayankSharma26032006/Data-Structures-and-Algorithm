class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num:tasks){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int rounds = 0;
        for(int freq:map.values()){
            if(freq==1)return -1;
            rounds+=freq/3;
            if(freq%3==1)rounds++;
            if(freq%3==2)rounds++;
        }
        return rounds;
    }
}