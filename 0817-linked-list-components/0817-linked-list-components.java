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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int count = 0;
        ListNode curr = head;
        boolean connected = false;
        while(curr!=null){
            if(set.contains(curr.val)&&!connected){
                connected = true;
                count++;

            }
            else if(set.contains(curr.val)&&connected){
                
            }          
            else{
                connected = false;
            }
            curr = curr.next;
        }
        return count;


    }
}