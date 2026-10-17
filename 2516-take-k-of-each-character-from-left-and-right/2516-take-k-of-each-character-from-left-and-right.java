class Solution {
    public int takeCharacters(String s, int k) {
        int n = s.length();
        int[] count = new int[3];
        for(int i = 0; i < n; i++)
            count[s.charAt(i) - 'a']++;

        for(int i = 0; i < 3; i++)
            if(count[i] < k) return -1;
        int left = 0, max = 0;

        for(int right = 0; right < n; right++) {
            count[s.charAt(right) - 'a']--;

            while(count[s.charAt(right) - 'a'] < k) {
                count[s.charAt(left) - 'a']++;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }

        return n - max;
    }
}