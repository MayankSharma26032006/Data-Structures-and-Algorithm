class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer>st = new Stack<>();
        st.push(0);
        for(int i = 0;i<nums.length;i++){
            
            if(!st.isEmpty()&&nums[st.peek()]>nums[i]){
                st.push(i);
            }
        }
        int width = 0;
        for(int i = nums.length-1;i>=0;i--){
            while(!st.isEmpty()&&nums[i]>=nums[st.peek()]){
                width = Math.max(width,i-st.pop());
            }
        }
        return width;
    }
}