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
    public boolean isValidBST(TreeNode root) {
        return Check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean Check(TreeNode root,long min,long max){
        if(root==null)return true;
        if(root.val<=min||root.val>=max){
            return false;
        }
        return Check(root.left,min,root.val)&&Check(root.right,root.val,max);
    }
}