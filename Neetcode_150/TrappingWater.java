//optimal approach
class Solution{
    public int trappingWater(int height[]){
//the observation 
 // eg arr=    [1,3,0,4,2]
  //leftmax[]   [1,3,3,4,4]
   //rightmax[]  [4,4,4,4,2]
    //we can notice that whenever h[i]<h[r] we only need leftMax as it would be<rightMax
    int left = 0;
    int right = height.length-1;
    int leftMax = height[0];
    int rightMax = height[right];
    int totalWater = 0;
    while(left<right){
        if(height[l]<height[r]){
            leftMax = Math.max(leftMax,height[l]);
            if(leftMax - height[l]>0){
                totalWater += leftMax - height[l];
            }
            left++;
        }
        else{
            rightMax = Math.max(rightMax,height[r]);
            if(rightMax-height[right]>0){
                totalWater += rightMax-height[right];
            }
            right--;
        }
    }
    return totalWater;
}
}
// class Solution{
//     public int trappingWater(int height[]){
//         int n = height.length;
//         int leftMax[] = new int[n];
//         int rightMax[] = new int[n];
//         leftMax[0] = height[0];
//         rightMax[n-1] = height[n-1];
//         for(int i=1;i<n;i++){
//             leftMax[i] = Math.max(height[i],leftMax[i-1]);
//         }
//         for(int i=n-2;i>=0;i--){
//             rightMax[i] = Math.max(height[i],rightMax[i+1]);
//         }
//         int waterVol = 0;
//         int totalWater = 0;
//         for(int i=0;i<n;i++){
//             waterVol = Math.min(leftMax[i],rightMax[i]) - height[i];
//             if(waterVol>0) totalWater+=waterVol;
//         }
//         return totalWater;
//     }
// }