class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }

        for(int num:nums2){
            if(set.contains(num)){
                ans.add(num);
            }
        }
        int[] finalans = new int[ans.size()];
        int idx = 0;
        for(int num:ans){
            finalans[idx++] = num;
        }
        return finalans;
    }
}