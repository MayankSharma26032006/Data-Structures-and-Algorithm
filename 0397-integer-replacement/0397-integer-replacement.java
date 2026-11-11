class Solution {
    public int integerReplacement(int n) {
        long num = n;
        int op = 0;
        while(num!=1){
            if(num%2==0){
                num = num/2;
                op++;
            }
            else if(num ==3 || num % 4 == 1) {
                num = num - 1;
                op++;
            }
            else{
                num = num+1;
                op++;
            }
        }
        return  op;
    }
}