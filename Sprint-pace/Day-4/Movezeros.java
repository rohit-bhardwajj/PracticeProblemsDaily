class Solution {
    public void moveZeroes(int[] arr) {
        int zerosCount = 0;
        int indx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) zerosCount++;
            else{
                arr[indx] = arr[i];
                indx++;
            }
        }
        for(int i=indx; i<arr.length;i++){
            arr[i] = 0;
        }
    }
}