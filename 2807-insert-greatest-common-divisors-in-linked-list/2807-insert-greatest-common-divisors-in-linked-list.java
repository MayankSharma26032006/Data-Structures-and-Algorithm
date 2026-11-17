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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while(curr.next!=null){
            ListNode ins = new ListNode(gcd(curr.val,curr.next.val));
            ins.next = curr.next;
            curr.next = ins;
            curr = ins.next;
        }
        return head;
    }
    public int gcd(int a ,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}