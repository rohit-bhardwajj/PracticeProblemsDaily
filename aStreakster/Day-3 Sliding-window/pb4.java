// Problem-4 LC 3 – Longest Substring Without Repeating Characters
class solution{
    public int LongestString(String s){
        int i=0,j=0; int n = s.length()-1;
        Set<Character> set = new HashSet<>();
        int MaxLen = Integer.MIN_VALUE;
        if(n+1==0) return 0;
        set.add(s.charAt(j++));
        while(i<=n && j<=n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                MaxLen = Math.max(set.size(),MaxLen);
                j++;
            }
            else{
                set.remove(i++);
            }
        }
        return Math.max(set.size(),MaxLen);
    }
}