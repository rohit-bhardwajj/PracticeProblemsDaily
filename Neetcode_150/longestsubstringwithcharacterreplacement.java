class solution{
    public int longSubstrWithcharRep(String s, int k){
        //two pointer approach
        int l=0;int r=0;
        int maxWindow=0; int maxCharOcc=0;
        //freq array to store character freqs
        int freqarr[]= new int[26];
        while(r<s.length()){
            char c = s.charAt(r);//current character
            freqarr[c-'A']++;//for uppercase letters wud give(0-25)
            maxCharOcc = Math.max(maxOcc,freqarr[c-'A']);//of any char atany.pt.oftime
            int windSize = r-l+1;//cuz 0 indexed
            maxWindow = Math.max(windSize,maxWindow);
            int charsTobeReplaced = windSize - maxCharOcc;//
            if( charsTobeReplaced > k ){
                freqarr[c-'A']--;//reduced freq of that leftmost char
                l++;//reduced window size
            }
            windSize = r-l+1;
            maxWindow = Math.max(maxWindow,windSize);
            r++;
        }
        return maxWindow;
    }
}