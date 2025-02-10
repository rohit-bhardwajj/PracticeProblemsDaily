class Solution{
    public int LongestStrWithtRepChar(String s){
        //first solution-using hashmap
        Map<Character,Integer> map = new HashMap<>();
        int maxC=0; int count=0;
        int l=0; int r=0;
        while(r<s.length()){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))>=l){
                l = map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i),r);
            }
            map.put(s.charAt(i),r);
            count = r-l+1;
            maxC = Math.max(maxC,count);
        }
        return maxC;
    }
}