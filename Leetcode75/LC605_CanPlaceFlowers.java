class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
           int size = flowerbed.length-1;
           int count=0;
        for(int i=0;i<flowerbed.length;i++){
           int elem = flowerbed[i]; 
            if(elem == 0 && (i==0 || flowerbed[i-1]==0) && (i==size || flowerbed[i+1]==0)){
                flowerbed[i] = 1;
                count++;
            }
        }
            if(count>=n) return true;
            return false;
    }
}