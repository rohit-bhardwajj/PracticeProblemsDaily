// optimal approach
class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = 0;
        for(int i=0;i<=nums.length;i++){
           xor1 = xor1^i;
        }
        int xor2 = 0;
        for(int i=0;i<nums.length;i++){
           xor2 = xor2^nums[i];
        }
// xor1 eg= 1^2^3^4^5^6
// xor2 eg= 1^2^3^4^6 ,xor1^xor2= will result in 0ing 
// of similar numbers like 1^1 = 0 ,so it'll endup giving the missing number
        return xor1^xor2; // 
    }
}

//good approach
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