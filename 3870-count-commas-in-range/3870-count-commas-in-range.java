class Solution {
    public int countCommas(int n) {
        if (n<1000)return 0;
        int ans = 0;
        ans += n - 999;
        return ans;
    }
}
