class Solution {
    public int findMaxLength(int[] nums) {
        int sum = 0;  int n = nums.length;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            if(nums[i]==1) sum++;//sum+1
            else sum--;//if 0 ,sum-1
            //as we want first occ. cuz it'd give longst subarray so:
            if(map.containsKey(sum)){
                ans = Math.max(ans,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return ans;
    }
}