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
    public int maxAncestorDiff(TreeNode root) {
        ans = 0;
        maxMin(root);
        return ans;
    }
    public int[] maxMin(TreeNode root){
        if(root==null)return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE};
        int[] left = maxMin(root.left);
        int[] right = maxMin(root.right);
        int min = Math.min(root.val,Math.min(left[0],right[0]));
        int max = Math.max(root.val,Math.max(left[1],right[1]));
        ans = Math.max(ans,Math.max(Math.abs(root.val-min),Math.abs(root.val-max)));
        return new int[]{min,max};
    }
}