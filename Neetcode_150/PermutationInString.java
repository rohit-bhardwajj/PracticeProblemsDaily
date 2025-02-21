//brute force
class Solution{
    public boolean isSameFreq(int []Freqarr,int []windarr){
        for(int i=0;i<26;i++){
            if(Freqarr[i]!=windarr[i]){
                return false;
            }
        }
        return false;
    }
    public boolean checkInclusion(String s1, String s2){
        int Freqarr[] = new int[26];
        Arrays.fill(Freqarr,0);
        int r=s1.length();
        for(char c: s1.toCharArray()){
            Freqarr[c-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            int l=0; idx = i;
            int windarr[] = new int[26];
            Arrays.fill(windarr,0); 
            while(l<r && idx<s2.length()){
                windarr[s2.charAt(idx)-'a']++;
            }
            if(isSameFreq(Freqarr,windarr)){
                return true;
            }
        }
        return false;
    } 
}