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
        ListNode curr = head;
        for(int i = 1;i<k;i++){
            if(curr==null)return head;
            curr = curr.next;
        }
        if(curr==null)return head;
        ListNode nextGrp = curr.next;
        curr.next = null;
        ListNode newHead = reverse(head);
        head.next = reverseKGroup(nextGrp,k);
        return newHead;
    }
    private ListNode reverse(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode ans = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return ans;
    }
}