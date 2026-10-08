class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:banned) {
            set.add(x);
        }
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(set.contains(i)) {
                continue;
            }
            if(sum + i > maxSum) {
                break;
            }
            sum += i;
            count++;
        }

        return count;
    }
}