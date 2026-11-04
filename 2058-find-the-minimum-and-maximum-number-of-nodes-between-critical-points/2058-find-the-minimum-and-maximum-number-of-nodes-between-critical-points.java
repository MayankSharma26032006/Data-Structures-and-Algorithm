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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[]ans = {-1,-1};
        ArrayList<Integer>points = new ArrayList<>();
        ListNode curr = head.next;
        ListNode prev = head;
        int idx = 1;
        while(curr!=null&&curr.next!=null){
            if(curr.val>prev.val&&curr.val>curr.next.val){
                points.add(idx);
            }
            if(curr.val<prev.val&&curr.val<curr.next.val){
                points.add(idx);
            }
            curr = curr.next;
            prev = prev.next;
            idx++;
        }
        Collections.sort(points);
        if(points.size()<2)return ans;
        
        int fpoint = points.get(points.size()-1)-points.get(0);
        int spoint = Integer.MAX_VALUE;
        for(int i = 1;i<points.size();i++){
            spoint = Math.min(spoint,points.get(i)-points.get(i-1));
        }
        ans[1] = fpoint;
        ans[0] = spoint;
        return ans;
    }
}