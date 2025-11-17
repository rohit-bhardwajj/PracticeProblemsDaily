class Solution {
    public int longestSubarray(int[] arr, int k) {
       int maxlen = 0;
       int presum = 0;
       HashMap<Integer,Integer> map = new HashMap<>();
       int j=0;
       map.put(0,-1);
       while(j<arr.length){
           presum += arr[j];
           int rem = presum-k;
           if(map.containsKey(rem)){
               int len = j-map.get(rem);
               maxlen = Math.max(maxlen,len);
           }
           if(!map.containsKey(presum)){
               map.put(presum,j);
           }
           j++;
       }
       return maxlen;
       
    }
}
