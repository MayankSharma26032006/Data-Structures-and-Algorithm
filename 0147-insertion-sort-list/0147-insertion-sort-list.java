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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        while(curr != null) {
            ListNode next = curr.next;
            ListNode temp = dummy;
            while(temp.next != null && temp.next.val < curr.val) {
                temp = temp.next;
            }
            curr.next = temp.next;
            temp.next = curr;

            curr = next;
        }

        return dummy.next;
    }
}