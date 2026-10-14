
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > num * 9) {
            return "";
        }
        StringBuilder ans = new StringBuilder();

        while(sum >= 9) {
            ans.append('9');
            sum -= 9;
            num--;
        }
        if(num > 0) {
            ans.append(sum);
            num--;
        }

        while(num > 0) {
            ans.append('0');
            num--;
        }

        return ans.toString();
    }
}
