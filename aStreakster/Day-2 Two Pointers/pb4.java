// Problem 4 LC-125. Valid Palindrome
class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        int leng = s.length()-1;
        while(i<j){
            while(i<=leng && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while(j>=0 && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if(i>leng||j<0) return true;
           char ci = s.charAt(i);
           char cj = s.charAt(j);
            ci = Character.toLowerCase(ci);
            cj = Character.toLowerCase(cj);
            if(ci!=cj){return false;}
            i++; j--;
        }
        return true;
    }
}