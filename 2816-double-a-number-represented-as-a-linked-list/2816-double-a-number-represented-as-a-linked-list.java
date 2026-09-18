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
    public ListNode doubleIt(ListNode head){
        head = reverse(head);
        ListNode curr = head;
        int carry = 0;
        while(curr!=null){
            int sum = curr.val*2+carry;
            curr.val = sum%10;
            carry = sum/10;
            curr = curr.next;

        }
        if(carry != 0) {
            ListNode node = new ListNode(carry);
            head = reverse(head);
            node.next = head;
            return node;
        }
        return reverse(head);
        
    }
    private ListNode reverse(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode ans = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return ans; 
    }
}