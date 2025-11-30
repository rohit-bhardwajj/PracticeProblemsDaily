class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int Mindiff = Integer.MAX_VALUE;
        int closestsum = 0;

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int l= i+1;
            int r = nums.length-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum==target) return sum;
                else if(sum<target) l++;
                else r--;
                int diff = Math.abs(sum-target);
                if(diff<Mindiff){
                    Mindiff = diff;
                    closestsum = sum;
                }
                else if(diff == Mindiff){
                    if(sum<closestsum){
                        closestsum = sum;
                    }
                }
            }
        }
        return closestsum;
    }
}