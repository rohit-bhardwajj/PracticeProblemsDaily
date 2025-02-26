//two pointer (variable length sliding window approach)
class Solution{
    public String minWindow(String s, String t){
        HashMap<Character,Integer> Freqmap = new HashMap<>();
        for(char c : t.toCharArray()){
            Freqmap.put(c,Freqmap.getOrDefault(c,0)+1);
        }
        int windowStart = 0; int windowEnd = 0;
        int minLen = Integer.MAX_VALUE; int StartIndx  = -1;
        int uniqueCharCount = Freqmap.size();
        while(windowEnd < s.length()){
            //expansion phase
            char ch = s.charAt(windowEnd);
            if(Freqmap.containsKey(ch)){
                Freqmap.put(ch,Freqmap.get(ch)-1);
                if(Freqmap.get(ch)==0){
                    uniqueCharCount--;//we've got that exact char
                }
            }
            //shriking phase
            while(uniqueCharCount==0){//window has exact chars as in t string
                //check if its minSubstr than prev
                int len = windEnd - windStart +1;
                if(len<minLen){
                    minLen = len;
                    StartIndx = windStart;
                }
                //shrink
                ch = s.charAt(windowStart);
                if(Freqmap.containsKey(ch)){
                    Freqmap.put(ch,Freqmap.get(ch)+1);
                    if(Freqmap.get(ch)>0){
                        uniqueCharCount++;
                    }
                }
                windStart++;
            }
            windEnd++;
        }
        if(StartIndx==-1){
            return "";
        }
        return s.substring(StartIndx,StartIndx+minLen);
    }
}