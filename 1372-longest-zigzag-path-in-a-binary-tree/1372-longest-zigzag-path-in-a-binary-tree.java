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
    public int longestZigZag(TreeNode root) {
        ans = 0;
        longest(root);
        return ans;
    }
    public int[] longest(TreeNode root){
        if(root==null)return new int[]{-1,-1};
        int[] left = longest(root.left);
        int[] right = longest(root.right);
        int leftd = 1+left[1];
        int rightd = 1+right[0];
        ans = Math.max(ans,Math.max(leftd,rightd));
        return new int[]{leftd,rightd};
    }
}