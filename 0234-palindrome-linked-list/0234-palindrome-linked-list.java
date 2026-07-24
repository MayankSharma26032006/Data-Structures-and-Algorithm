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
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)return true;
        ListNode mid = middle(head);
        ListNode second = reverse(mid);
        ListNode first = head;
        ListNode temp = second;
        while(temp!=null){
            if(first.val!=temp.val)return false;
            first = first.next;
            temp = temp.next;
        }
        return true;
        
    }
    public ListNode middle(ListNode head){
        if(head==null||head.next==null)return head;
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