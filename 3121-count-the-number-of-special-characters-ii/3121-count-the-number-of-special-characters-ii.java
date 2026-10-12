class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lower = new int[26];
        int[] upper = new int[26];

        for(int i = 0; i < 26; i++) {
            lower[i] = -1;
            upper[i] = -1;
        }

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if(c >= 'a' && c <= 'z') {
                lower[c - 'a'] = i;
            }
            else if(upper[c - 'A'] == -1) {
                upper[c - 'A'] = i;
            }
        }
        int count = 0;
        for(int i = 0; i < 26; i++) {
            if(lower[i] != -1 && upper[i] != -1 && lower[i] < upper[i]) {
                count++;
            }
        }

        return count;
    }
}