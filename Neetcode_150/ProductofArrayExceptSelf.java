class Soultion{
    public int[] productExceptSelf(int[] nums){
        int prefixArr[] = new int[nums.length];
        int suffixArr[] = new int[nums.length];
        for(int i=1;i<nums.length;i++){
            prefixArr[0]=1;
            prefixArr[i]= prefixArr[i-1] * nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            suffixArr[nums.length-1] =1;
            suffixArr[i] = suffixArr[i+1] * nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=prefixArr[i] * suffixArr[i];
        }
        return nums;
    }
}