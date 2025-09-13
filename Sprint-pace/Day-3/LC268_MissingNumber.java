//optimal solution
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int naturalSum = (n * (n+1))/2;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
           sum += nums[i];
        }
        return naturalSum-sum;
    }
}

//better approach
class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}

//brute force method
class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0;i<=nums.length;i++){
            int flag = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    flag=1;
                }
            }
            if(flag==0) return i;
        }
        return -1;
    }
}

//another method
class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}