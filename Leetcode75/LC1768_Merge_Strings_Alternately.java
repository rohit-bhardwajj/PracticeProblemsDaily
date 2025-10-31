//better soln
class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder result = new StringBuilder();
        int l = 0;
        while(l<w1.length() || l<w2.length()){
            if(l<w1.length()){
            result.append(w1.charAt(l));
            }
            if(l<w2.length()){
            result.append(w2.charAt(l));
            }
            l++;
        }
        
        return result.toString();
    }
}
//kinda O(n^2) at line 27
class Solution {
    public String mergeAlternately(String w1, String w2) {
        String result = "";
        int l = 0,r = 0;
        while(l<w1.length() && r<w2.length()){
            char a = w1.charAt(l);
            char b = w2.charAt(r);
            result = result + a+b;
            l++; r++;
        }
         while(l<w1.length()){
            char a = w1.charAt(l);
            result = result + a;
            l++;
        }
        while(r<w2.length()){
         char b = w2.charAt(r);
            result = result +b;
            r++;
        }
        return result;
    }
}