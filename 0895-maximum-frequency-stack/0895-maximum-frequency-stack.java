class FreqStack {
    HashMap<Integer,Integer> freq;
    HashMap<Integer,Stack<Integer>> map;
    int maxFreq;
    public FreqStack() {
        freq = new HashMap<>();
        map = new HashMap<>();
        maxFreq = 0;
    }
    public void push(int val) {
        int f = freq.getOrDefault(val,0) + 1;
        freq.put(val,f);
        maxFreq = Math.max(maxFreq,f);

        map.putIfAbsent(f,new Stack<>());
        map.get(f).push(val);
    }
    public int pop() {
        int val = map.get(maxFreq).pop();

        freq.put(val,freq.get(val)-1);

        if(map.get(maxFreq).isEmpty()){
            maxFreq--;
        }

        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */