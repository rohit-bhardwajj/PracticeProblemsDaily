//better approach
class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            //skip non-alphanumeric characters
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            char left = Character.toLowerCase(s.charAt(l));
            char right = Character.toLowerCase(s.charAt(r));
            if(left==right){
                l++; r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
//using regex
class Solution {
    public boolean isPalindrome(String s) {
      s = s.toLowerCase();
      s= s.replaceAll("[^a-z0-9]","");
        int l = 0; int r = s.length()-1;
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++; r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
