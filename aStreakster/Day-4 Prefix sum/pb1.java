class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0; int presum = 0;
        map.put(0,1);
        for(int j=0;j<nums.length;j++){
            presum += nums[j];
            int rem = presum-k;
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return count;
    }
}