class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int ans[] = new int[queries.length];
        Arrays.sort(nums);
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        for(int i=0;i<queries.length;i++){
            int a = Arrays.binarySearch(prefix,queries[i]);
            if(a<0){
                a = Math.abs(a)-1;
            }
            else{
                a++;
            }
            ans[i] = a;
        }
        return ans;
    }
}