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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null)return null;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int levels = 0;
        while(!q.isEmpty()){
            int size = q.size();
            TreeNode[] arr = new TreeNode[size];
            for(int i = 0;i<size;i++){
                arr[i] = q.poll();
                if(arr[i].left!=null){
                    q.add(arr[i].left);
                }
                if(arr[i].right!=null){
                    q.add(arr[i].right);
                }  
            }
            if(levels%2==1){
                int l = 0;
                int r = size-1;
                while(l<r){
                    int temp  = arr[l].val;
                    arr[l].val = arr[r].val;
                    arr[r].val = temp;
                    l++;
                    r--;
                }
            }
            levels++;
        }
        return root;
    }
}