class Solution {
    public int trap(int[] height) {
        int left = 0;
        int lmax = 0;
        int right = height.length-1;
        int rmax = 0;
        int water = 0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>lmax){
                    lmax = height[left];
                    left++;
                }
                else{
                    water+=lmax-height[left];
                    left++;
                }
            }
            else{
                if(height[right]>rmax){
                    rmax = height[right];
                    right--;
                }
                else{
                    water+= rmax-height[right];
                    right--;
                }
            }
        }
        return water;


        
    }
}