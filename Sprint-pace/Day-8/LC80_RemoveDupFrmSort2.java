class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr =1;
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[ptr] = nums[i];
                ptr++;
                count=1;
            }
            else if((nums[i-1]==nums[i]) && count<2){
                nums[ptr] = nums[i];
                ptr++; count++;
            }
        }
        return ptr;
    }
}