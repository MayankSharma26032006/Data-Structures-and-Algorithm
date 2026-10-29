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
    public int pairSum(ListNode head) {
        ListNode mid = middle(head);
        ListNode second = reverse(mid);
        int max = 0;
        ListNode curr = head;
        while(second!=null){
            max = Math.max(max,curr.val+second.val);
            curr = curr.next;
            second = second.next;
        }
        return max;
        
        
    }
    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode ans = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return ans;
    }
}