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
    ArrayList<Integer> ans = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        int i = 0;
        int j = ans.size()-1;
        while(i<j){
            if(ans.get(i)+ans.get(j)==k){
                return true;
            }
            else if(ans.get(i)+ans.get(j)>k){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
    public void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }
}