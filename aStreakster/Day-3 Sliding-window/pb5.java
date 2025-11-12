// Problem-5 LC-424 Longest Repeating Character Replacement
//sliding window implementation method
/*  l=0;
for(r=0;r<size;r++)
     expand the window  by appending elements
     shrink the window if it doesn't match the condition//i.e start removing
     update ,eg. update length
*/
class Solution {
    public int characterReplacement(String s, int k) {
        int i=0; int j=0; int maxlen = 0;
        int freq[]= new int[26];
        int maxfreq = 0;
        while(j<s.length()){
        //1 expand the window
            freq[s.charAt(j)-'A']++;
            maxfreq = Math.max(maxfreq,freq[s.charAt(j)-'A']);
        //2 remove from left while its invalid
            while((j-i+1)-maxfreq>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
        //3 update 
            maxlen = Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}
