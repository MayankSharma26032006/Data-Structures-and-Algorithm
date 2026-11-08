class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n > m) return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0; i < n; i++) {
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(arr1, arr2)) return true;

        for(int i = n; i < m; i++) {
            arr2[s2.charAt(i) - 'a']++;
            arr2[s2.charAt(i - n) - 'a']--;

            if(Arrays.equals(arr1, arr2)) return true;
        }
        return false;
        
    }
}