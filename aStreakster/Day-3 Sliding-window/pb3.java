// Problem-3 LC-643. Maximum Average Subarray I
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double MaxAvg = Integer.MIN_VALUE;
         int i=0; int j=0; double sum = nums[j];
        int n = nums.length-1; double currAvg = 0;
        while(i<=n && j<=n){
            if(j-i+1<k){
                if(j>=n){
                    return Math.max(currAvg,MaxAvg);
                }
                j++;
                sum = sum + nums[j];
            }
            else{
                currAvg = sum/k;
                MaxAvg = Math.max(currAvg,MaxAvg);
                sum = sum - nums[i];
                i++;
            }
        }
        return MaxAvg;
    }
}