// Problem 1 LC-1929. Concatenation of Array
class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = 2*(nums.length);
        int arr[] = new int[len];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        int j = 0;
        for(int i=nums.length;i<len && j<nums.length;i++){
            arr[i] = arr[j];
            j++; 
        }
        return arr;