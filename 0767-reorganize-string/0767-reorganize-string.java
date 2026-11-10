class Solution {
    public String reorganizeString(String s) {
        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int max = 0;
        int idx = 0;

        for(int i = 0; i < 26; i++) {
            if(freq[i] > max) {
                max = freq[i];
                idx = i;
            }
        }

        if(max > (s.length() + 1) / 2) return "";

        char[] ans = new char[s.length()];
        int i = 0;

        while(freq[idx] > 0) {
            ans[i] = (char)(idx + 'a');
            i += 2;
            freq[idx]--;
        }
        for(int j = 0; j < 26; j++) {
            while(freq[j] > 0) {
                if(i >= s.length()) i = 1;
                ans[i] = (char)(j + 'a');
                i += 2;
                freq[j]--;
            }
        }
        return new String(ans);
    }
}