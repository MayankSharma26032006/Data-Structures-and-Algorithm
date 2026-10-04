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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode head = null;
        ListNode prev = null;
        int carry = 0;
        while(l1!=null||l2!=null||carry!=0){
            int a = 0;
            int b = 0;
            if(l1!=null){
                a = l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                b = l2.val;
                l2 = l2.next;
            }
            int sum = a+b+carry;
            ListNode curr = new ListNode(sum%10);
            carry = sum/10;
            if(head==null){
                head = curr;
                prev = curr;
            }
            else{
                prev.next = curr;
                prev = curr;
            }
        }
        head = reverse(head);
        return head;
        
    }
    ListNode reverse(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode ans = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return ans;

    }
}