// Problem-1 LC-209 Minimum Size Subarray Sum
class Solution{
    public int minSubarrayLen(int[] nums,int target){
         int i=0,j=0; int sum = nums[j];
        int MinSize = Integer.MAX_VALUE; int siz = 0;
        int n = nums.length-1;
        while(i<=n && j<=n){
            if(sum<target){
                if(j>=n){
                    return Math.min(siz,MinSize);
                }
                j++; sum += nums[j];//expand the window
            }
            else{
                siz = j-i+1;
                MinSize = Math.min(siz,MinSize);
                Sum = Sum - nums[i]; //shrink the window from left
                i++;
                if(sum>=target){
                siz = j-i+1;
                MinSize = Math.min(siz,MinSize);
                }
            }
        }
        return MinSize;
    }
}