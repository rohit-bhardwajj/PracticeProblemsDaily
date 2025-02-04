class Solution{
    public int containerMaxWater(int[] nums){
        int l = 0; int r = nums.length-1;
        int area = 0; int maxArea = 0;
        while(l<r){
         area = Math.min(nums[l],nums[r]) * (r-l);
         maxArea = Math.max(area,maxArea);
         if(nums[l]<nums[r]){
            l++;
         }
         else{
            r--;
         }  
        }
        maxArea = Math.max(area,maxArea);
        return maxArea;
    }
}