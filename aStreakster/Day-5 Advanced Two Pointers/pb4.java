// Count triplets with sum smaller than a given value
class Solution {
    long countTriplets(int n, int sum, long nums[]) {
        long count = 0;
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                long Currsum = (long) nums[i]+nums[l]+nums[r];
                if(Currsum>=sum){
                    r--;
                }
                else{
                    //if(cursum<sum),(i,l,r give sum<targetsum) so (i,l,r-1),(i,l,r-2),(i,l,r-3)all those for given l would obviously give sum<targetsum and their count is r-l
                    count += r-l;//counting all valid triplets for given l
                    l++;
                }
            }
        }
        return count;
    }
}
