//TC:O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int a=0;a<nums.length;a++){
            hmap.put(nums[a],a);
        }
        for(int i=0;i<nums.length;i++){
            int num = target-nums[i];
            if(hmap.containsKey(num) && hmap.get(num)!=i){
                return new int[] {i,hmap.get(num)};
            }
        }
        return new int[] {-1,-1};
    }
}