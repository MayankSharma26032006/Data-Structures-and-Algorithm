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
    public ListNode rotateRight(ListNode head, int k) {  
        if(head==null||head.next==null||k==0)return head;
        ListNode curr = head;
        int len = 1;
        while(curr.next!=null){
            curr = curr.next;
            len++;
        }      
        curr.next = head;
        k%=len;
        int newhead = len-k;
        ListNode newTail = curr;
        while(newhead-->0){
            newTail = newTail.next;

        }
        ListNode finalhead = newTail.next;
        newTail.next = null;
        return finalhead;
    }
}