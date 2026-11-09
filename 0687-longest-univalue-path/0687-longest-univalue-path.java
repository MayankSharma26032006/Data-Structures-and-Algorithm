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
    static int length = 0;
    public int longestUnivaluePath(TreeNode root) {
        length = 0;
        longest(root);
        return length;
    }
    public int longest(TreeNode root){
        if(root==null)return 0;
        int left = longest(root.left);
        int right = longest(root.right);
        if(root.left!=null&&root.val==root.left.val){
            left++;
        }
        else left = 0;
        if(root.right!=null&&root.val==root.right.val){
            right++;
        }
        else right = 0;
        length = Math.max(length,left+right);
        return Math.max(left,right);
    }
}