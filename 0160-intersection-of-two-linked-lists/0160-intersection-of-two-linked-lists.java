/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(headA!=headB){
            if(headA==null){
                headA = tempB;
            }
            else{
                headA = headA.next;
            }
            if(headB==null){
                headB = tempA;
            }
            else{
                headB = headB.next;
            }
        }
        return headA;
        
    }
}