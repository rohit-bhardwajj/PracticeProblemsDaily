import java.util.*;
class Solution {
    public String makeAnagram(String s){
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public boolean isAnagram(String s, String l) {
         return makeAnagram(s).equals(makeAnagram(l));
    }
}