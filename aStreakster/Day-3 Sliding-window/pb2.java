// Problem LC-1456 – Maximum Number of Vowels in a Substring of Given Length
class Solution {
    public int maxVowels(String s, int k) {
        int i = 0; int j = 0;
        int n = s.length()-1;
        char arr[] = s.toCharArray();
        int VowelCount = 0; int MaxCount = Integer.MIN_VALUE;

        if (arr[j]=='a'||arr[j]=='e'||arr[j]=='i'||arr[j]=='o'||arr[j]=='u') {
            VowelCount++;
        }
        
        while (i <= n && j <= n) {
            if (j - i + 1 < k) {
                //expand the window
                if (j >= n) {
                    return Math.max(VowelCount, MaxCount);
                }
                j++;
                 if (arr[j]=='a'||arr[j]=='e'||arr[j]=='i'||arr[j]=='o'||arr[j]=='u'){
                    VowelCount++;
                }
            } else {
                MaxCount = Math.max(VowelCount, MaxCount);
                 if (arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                    VowelCount--;
                }
                i++;//shrink window
            }
        }
        return MaxCount;
    }
}