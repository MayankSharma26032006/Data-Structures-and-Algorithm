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
    public int findBottomLeftValue(TreeNode root){
        if(root==null)return 0;
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int size = q.size();
            ans = new ArrayList<>();
            for(int i = 0;i<size;i++){
                TreeNode curr = q.poll();
                ans.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }

        }
        return ans.get(0);      
    }
}