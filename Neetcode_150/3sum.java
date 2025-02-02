class Solution{
    public List<List<Integer>> threeSum(int nums[]){
        //sort //twopointer
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length && nums[i]<=0;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int first = nums[i];
            int l=i+1; int r=nums.length-1;
            while(l<r){
                int sum = first + nums[l] + nums[r];
                if(sum==0){
                    list.add(Arrays.asList(first,nums[l++],nums[r--]));
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                }
                if(sum<0){
                    l++;
                }
                else if(sum>0){
                    r--;
                }
            }
        }
        return list;
    }
}