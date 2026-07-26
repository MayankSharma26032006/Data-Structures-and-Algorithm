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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null)return head;
        ListNode temp = point(head,k);
        if(temp==null)return head;
        ListNode calling = reverseKGroup(temp.next,k);
        temp.next = null;
        ListNode newHead = reverse(head);
        head.next = calling;
        return newHead;
    }
    public ListNode point(ListNode head,int k){
        ListNode curr = head;
        for(int i = 1;i<k;i++){
            curr = curr.next;
            if(curr==null)return null;
        }
        return curr;
    }
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode ans = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return ans;
    }
}