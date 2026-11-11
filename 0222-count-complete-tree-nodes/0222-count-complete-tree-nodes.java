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
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        int left = leftHeight(root);
        int right = rightHeight(root);
        if(left==right){
            return (1<<left)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public int leftHeight(TreeNode root){
        if(root==null)return 0;
        int left = 1;
        while(root.left!=null){     
            root = root.left;  
            left++;       
        }
        return left;
    }
    public int rightHeight(TreeNode root){
        if(root==null)return 0;
        int right = 1;
        while(root.right!=null){          
            root = root.right;
            right++;
            
        }
        return right;
    }

}