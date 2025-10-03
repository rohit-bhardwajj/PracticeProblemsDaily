class Solution {
    public void rev(int[] nums,int i, int j){
        while(i<=j){
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;//to handle edge case where k>=n
        rev(nums,0,n-1);//rev whole arr
        rev(nums,0,k-1);//rev from 0 to k-1
        rev(nums,k,n-1);//rev from k to n-1
    }
}