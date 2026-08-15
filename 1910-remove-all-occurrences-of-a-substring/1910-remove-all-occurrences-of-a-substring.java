class Solution {
    public String removeOccurrences(String s, String part) {
        int idx = s.indexOf(part);
        if(idx==-1)return s;
        s = s.substring(0,idx)+s.substring(idx+part.length());
        return removeOccurrences(s,part);
    }
}