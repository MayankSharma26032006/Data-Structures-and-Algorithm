class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;
        for(int i= 0;i<k;i++){
            char st = s.charAt(i);
            if(vowel(st)){
                count++;
            }
        }
        max = count;
        for(int i = k;i<s.length();i++){
            if(vowel(s.charAt(i))){
                count++;
            }
            if(vowel(s.charAt(i-k))){
                count--;
            }
            max = Math.max(max,count);

        }
        return max;
    }
    public boolean vowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        else{
            return false;
        }
        
    }
}