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
    public TreeNode construct(int[]preorder,int prelow,int prehigh,int[]inorder, int inlow, int inhigh){
        if(prelow>prehigh)return null;
        TreeNode root = new TreeNode(preorder[prelow]);
        int i = inlow;
        while(inorder[i]!=preorder[prelow])i++;
        int leftsize = i-inlow;
        root.left = construct(preorder,prelow+1,prelow+leftsize,inorder,inlow,i-1);
        root.right = construct(preorder,prelow+leftsize+1,prehigh,inorder,i+1,inhigh);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==1)return new TreeNode(preorder[0]);
        int n = preorder.length;
        return construct(preorder,0,n-1,inorder,0,n-1);
        
    }
}