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
    static int ans = 0;
    public int distributeCoins(TreeNode root) {
        ans = 0;
        solve(root);
        return ans;
    }
    public int solve(TreeNode root){
        if(root==null)return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        ans+= Math.abs(left)+Math.abs(right);
        return root.val+left+right-1;
    }
}