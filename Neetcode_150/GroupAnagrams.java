class Solution{
    public List<List<String>> GroupAnagrams(String[] strngs){
        //write your logic
        if(strngs.length()==0){
            return new ArrayList();//empty
        }
        Map<String,List> map = new HashMap<>();
        int count[] = new int[26];
        for(String s:strngs){
            Arrays.fill(count,0);
            for(char c:s.tocharArrays()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            for(int c : count){
                sb.append("#");
                sb.append(c);
            }
            String Key = sb.toString();
            if(!map.containsKey()){
                map.put(Key,new ArrayList());
            }
            map.get(Key).add(s);

        }
        return new ArrayList(map.Values());

    }
}