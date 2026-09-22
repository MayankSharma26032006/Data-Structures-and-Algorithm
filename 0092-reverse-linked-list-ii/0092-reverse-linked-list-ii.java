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
    public ListNode reverseBetween(ListNode head, int left, int right){
        if(head==null||head.next==null)return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = dummy.next;
        for(int i = 1;i<left;i++){
            curr= curr.next;
            prev = prev.next;
        }
        ListNode revHead = null;
        ListNode revTail = curr;
        for(int i = left;i<=right;i++){
            ListNode nxt = curr.next;
            curr.next = revHead;
            revHead = curr;
            curr = nxt;
        }
        prev.next = revHead;
        revTail.next = curr;
        return dummy.next;


        
    }
    
}