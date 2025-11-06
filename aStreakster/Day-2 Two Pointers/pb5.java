// Problem 5 LC-167. Two Sum II - Input Array Is Sorted
class Solution {
    public int[] twoSum(int[] nums, int t) {
         int i=0,j=nums.length-1;
         while(i<j){
            int sum = nums[i]+nums[j];
            if(sum==t) return new int[]{i+1,j+1};
            if(sum<t) i++;
            else if(sum>t) j--;
         }
         return new int[]{-1,-1};
    }
}