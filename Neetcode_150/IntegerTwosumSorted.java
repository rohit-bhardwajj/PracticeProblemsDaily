class Solution{
    public int[] twosumSorted(int [] nums,int target){
        
        int l=0; int h=nums.length-1;
        while(l<h){
            if(nums[l]+nums[h]<target){
                l++;
            }
            else if(nums[l]+nums[h]>target){
                h--;
            }
            if(nums[l]+nums[h]==target){
                return new int[]{l+1,h+1};
            }
        }
        return new int[]{-1,-1};
    }
}