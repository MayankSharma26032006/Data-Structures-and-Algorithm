class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    private void solve(int[] nums,int index,List<Integer> list,List<List<Integer>> ans) {
        if(index==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        solve(nums,index+1,list,ans);
        list.remove(list.size()-1);
        solve(nums,index+1,list,ans);
    }
}