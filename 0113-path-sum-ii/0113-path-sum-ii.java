/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> paths = new ArrayList<>();
        path(root,targetSum,paths,ans);
        return ans;
        
    }
    public void path(TreeNode root,int targetSum,List<Integer> paths,List<List<Integer>> ans){
        if(root==null)return;
        paths.add(root.val);
        targetSum-=root.val;
        if(root.left==null&&root.right==null){
            if(targetSum==0){
                ans.add(new ArrayList<>(paths));
            }

        }
        path(root.left,targetSum,paths,ans);
        path(root.right,targetSum,paths,ans);
        paths.remove(paths.size()-1);
    }
}