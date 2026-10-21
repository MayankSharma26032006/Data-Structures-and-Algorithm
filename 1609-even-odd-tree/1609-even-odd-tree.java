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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null)return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int levels = 0;
        while(!q.isEmpty()){
            int size = q.size();
            TreeNode[]arr = new TreeNode[size];
            for(int i = 0;i<size;i++){
                arr[i] = q.poll();
                if(arr[i].left!=null){
                    q.add(arr[i].left);
                }
                if(arr[i].right!=null){
                    q.add(arr[i].right);
                }
            }
            for(int i = 0; i < size; i++) {
                int val = arr[i].val;
                if(levels % 2 == 0) {
                    if(val % 2 == 0) return false;
                    if(i>0&&arr[i - 1].val >= val) return false;
                }else {
                    if(val%2 != 0) return false;
                    if(i>0&&arr[i - 1].val <= val) return false;
                }
            }
            levels++;
        }
        return true;
    }
}