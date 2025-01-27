class Solution {
    public String encode(List<String> strs) {
      StringBuilder sb = new StringBuilder();

      for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i).length()+"#"+strs.get(i));
        }
     return sb.toString();
    }

    public List<String> decode(String str) {
    List<String> list = new ArrayList<>();
    int i = 0;
    
    while (i < str.length()) {
        int j = i;
        
        // Find the position of '#'
        while (str.charAt(j) != '#') {
            j++;
        }
        
        // Extract length of the next string
        int len = Integer.parseInt(str.substring(i, j));
        
        // Move pointer past the '#'
        i = j + 1;
        
        // Extract the string based on length
        list.add(str.substring(i, i + len));
        
        // Move pointer to the next encoded section
        i += len;
    }
    
    return list;
}

}
