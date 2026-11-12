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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;
        if(root.val==key){
            if(root.left==null&&root.right==null)return null;
            if(root.left==null)return root.right;
            if(root.right==null)return root.left;
            if(root.left!=null&&root.right!=null){
                TreeNode att = pre(root.left);
                root.val = att.val;
                root.left = deleteNode(root.left,att.val); 
            }
        }
        else if(root.val>key)root.left = deleteNode(root.left,key);
        else root.right = deleteNode(root.right,key);;
        return root;
    }
    public TreeNode pre(TreeNode root){
        while(root.right!=null){
            root = root.right;
        }
        return root;
    }
}