class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> Hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(Hmap.containsKey(target-nums[i])){
                return new int []{i,Hmap.get(target-nums[i])};
            }
             Hmap.put(nums[i],i);
        }
        
        
        return new int[]{-1,-1};
    }
}