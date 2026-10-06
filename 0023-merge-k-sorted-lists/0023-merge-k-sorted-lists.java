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
        if(a==null)return b;
        if(b==null)return a;
        while(a!=null||b!=null){
            if(a.val<b.val){
                a.next = merge(a.next,b);
                return a;
            }
            else{
                b.next = merge(a,b.next);
                return b;
            }
        }
        return null;
    }
    
}