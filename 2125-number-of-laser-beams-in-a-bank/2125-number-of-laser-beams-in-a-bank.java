class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0, ans = 0;
        for(String s : bank) {
            int curr = 0;
            for(char c : s.toCharArray()) {
                if(c == '1') curr++;
            }
            if(curr > 0) {
                ans += prev * curr;
                prev = curr;
            }
        }
        return ans;
        
    }
}