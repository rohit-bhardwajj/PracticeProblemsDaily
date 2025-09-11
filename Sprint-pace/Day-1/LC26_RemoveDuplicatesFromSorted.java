class Solution {
    public int removeDuplicates(int[] nums) {
        // bruteforce
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
        //another method (space issue)
        // ArrayList<Integer> arr = new ArrayList<>();
        // if(nums.length>0){
        //     arr.add(nums[0]);
        // }
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=nums[i-1]){
        //        arr.add(nums[i]);
        //     }
        // }
        // for(int i=0;i<arr.size();i++){
        //     nums[i]=arr.get(i);
        // }
       
        // return arr.size();
// another method (space issue)
        // Set<Integer> set = new LinkedHashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     set.add(nums[i]);
        // }    
        // int j=0;
        // for(Integer val:set){
        //     nums[j++] = val;
        // }
        // return set.size();

    }
}