/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> temp = new ArrayList<>();
        Stack<Integer>st = new Stack<>();
        while(head!=null){
            temp.add(head.val);
            head = head.next;
        }
        int[]ans = new int[temp.size()];
        for(int i = temp.size()-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<=temp.get(i)){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = 0;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(temp.get(i));      
        }
        return ans;
        

    }
}