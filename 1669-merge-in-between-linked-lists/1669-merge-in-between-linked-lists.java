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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1==null)return list2;
        if(list2==null)return list1;
        ListNode dummy = new ListNode(-1);
        dummy.next = list1;
        ListNode curr = dummy;
        for(int i = 0;i<a;i++){
            curr = curr.next;
        }
        ListNode tail = dummy;
        for(int i = 0;i<=b+1;i++){
            tail = tail.next;
        }
        ListNode toConnect = list2;
        while(toConnect.next!=null){
            toConnect = toConnect.next;
        }
        curr.next = list2;
        toConnect.next = tail;
        return dummy.next;

    }
}