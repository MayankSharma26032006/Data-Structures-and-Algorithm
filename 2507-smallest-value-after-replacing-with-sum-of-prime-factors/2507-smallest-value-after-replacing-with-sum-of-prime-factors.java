class Solution {
    public int smallestValue(int n) {
        while(true){
            int sum = 0, x = n;
            for(int i = 2; i <= x; i++){
                while(x % i == 0){
                    sum = sum + i;
                    x = x / i;
                }
            }
            if(sum == n) return n;
            n = sum;
        }
    }
}