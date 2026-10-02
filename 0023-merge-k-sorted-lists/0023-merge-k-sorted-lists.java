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
    public ListNode mergeKLists(ListNode[] lists){
         if(lists.length==0)return null;
        ListNode head = lists[0];
        for(int i = 1;i<lists.length;i++){
            head = merge(head,lists[i]);
        }
        return head;
    }
    private ListNode merge(ListNode a,ListNode b){
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        while(a!=null&&b!=null){
            if(a.val<b.val){
                curr.next = a;
                a = a.next;
            }
            else{
                curr.next = b;
                b = b.next;
            }
            curr = curr.next;
        }
        if(a!=null){
            curr.next = a;
        }
        if(b!=null){
            curr.next = b;
        }
        return head.next;
        
    }
    
}