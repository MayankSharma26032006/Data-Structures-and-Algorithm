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
    int count = 0;
    public int countDominantNodes(TreeNode root){
        count = 0;
        Max(root);
        return count;
    
    }
    public int Max(TreeNode root){
        if(root==null)return 0;
        int lmax = Max(root.left);
        int rmax = Max(root.right);
        int max = Math.max(root.val,Math.max(lmax,rmax));
        if(root.val==max){
            count++;
        }
        return max;
    }
}