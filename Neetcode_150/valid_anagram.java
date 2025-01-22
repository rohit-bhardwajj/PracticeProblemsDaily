//optimal solution
import java.util.*;
class Solution {
   
    public boolean isAnagram(String s, String l) {
        if(s.length()!=l.length()){
            return false;
        }
         char arr[]= new char[26];
         for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[l.charAt(i)-'a']--;
         }
         for(int count:arr){
            if(count!=0)
            return false;
         }
         return true;
    }
}

// import java.util.*;
// class Solution {
//     public String makeAnagram(String s){
//         char arr[] = s.toCharArray();
//         Arrays.sort(arr);
//         return new String(arr);
//     }
//     public boolean isAnagram(String s, String l) {
//          return makeAnagram(s).equals(makeAnagram(l));
//     }
// }