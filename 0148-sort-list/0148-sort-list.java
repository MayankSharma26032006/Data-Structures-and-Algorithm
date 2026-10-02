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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode curr = mid(head);
        ListNode second = curr.next;
        curr.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(second);
        return merge(left,right);
    }
    private ListNode merge(ListNode a, ListNode b){
        if(a==null)return b;
        if(b==null)return a;
        if(a.val<b.val){
            a.next = merge(a.next,b);
            return a;
        }
        else{
            b.next = merge(a,b.next);
            return b;
        }
    }
    private ListNode mid(ListNode head){
        if(head==null)return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}