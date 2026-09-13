class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a, b)->{
            if (map.get(a) == map.get(b))
                return a.compareTo(b);

            return map.get(b) - map.get(a);
        });

        return list.subList(0, k);
    }
}