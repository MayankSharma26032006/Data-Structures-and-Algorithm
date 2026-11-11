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
    public int pathSum(TreeNode root, int targetSum) {
        return solve(root,targetSum);
    }
    public int solve(TreeNode root,long targetSum){
        if(root==null)return 0;
        int ans = path(root,targetSum);
        ans+=solve(root.left,targetSum);
        ans+=solve(root.right,targetSum);
        return ans;
    }
    public int path(TreeNode root,long targetSum){
        if(root==null)return 0;
        targetSum-=root.val;
        int ans = 0;
        if(targetSum==0){
            ans++;
        }
        ans+=path(root.left,targetSum);
        ans+=path(root.right,targetSum);
        return ans;
    }
}