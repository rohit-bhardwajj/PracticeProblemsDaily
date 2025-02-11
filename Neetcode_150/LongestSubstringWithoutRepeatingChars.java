//more optimal approach using array of indexes
class Solution{
    public int LongestStrWithtRepChar(String s){
        int l=0; int r=0;
        int count = 0; int maxC= 0;
        int hasharr[] = new int[256];
        Arrays.fill(hasharr,-1);//to mark all chars unseen
        //as we encounter a char we'll mark its place in arr by its recent index at which it was seen
        while(r<s.length()){
            char currentChar = s.charAt(r);
            if(hasharr[currentChar]!=-1 &&/*means char is coming another time*/
            hasharr[currentChar]>=l){/*means char is part of currnt substring*/
        //we'll need to remove its prev occ from currnt substring
            l = hasharr[currentChar] /*its prev index */ + 1;
            hasharr[currentChar] = r; //update its new index value
            }
            //else if char is coming first time in substring
            //assign its place in array as its index
            hasharr[currentChar]= r;
            count = r-l+1;
            maxC = Math.max(maxC,count);
        }
        return maxC;
    }
}


//using hashmap
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