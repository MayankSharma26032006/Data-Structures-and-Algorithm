class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        for(int j = 1;j<=n;j++){
            if(i==target.length) break;
            if(target[i]==j){
                ans.add("Push");
                i++;
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }

        }
        return ans;
        
    }
}