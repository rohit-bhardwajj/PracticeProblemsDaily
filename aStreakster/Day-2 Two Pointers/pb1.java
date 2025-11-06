// Problem 1 LC-977. Squares of a Sorted Array
class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int i=nums.length-1;
        int l= 0, r=nums.length-1;
        while(l<=r){
            int left = nums[l] * nums[l];
            int right = nums[r] * nums[r];
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                ans[i] = left; l++; i--;
            }
            else{
                ans[i] = right; r--; i--;
            }
        }
        return ans;
    }
}