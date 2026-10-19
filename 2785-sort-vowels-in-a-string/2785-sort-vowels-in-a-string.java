class Solution {
    public String sortVowels(String s) {
        char[] arr = s.toCharArray();
        String vowels = "AEIOUaeiou";
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(vowels.indexOf(arr[i])!= -1) {
                list.add(arr[i]);
            }
        }

        Collections.sort(list);
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(vowels.indexOf(arr[i]) != -1) {
                arr[i] = list.get(j);
                j++;
            }
        }

        return new String(arr);
    }
}