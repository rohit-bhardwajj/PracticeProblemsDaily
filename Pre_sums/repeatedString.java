//return the minimum no. string a should be repeated ,such that it contains string b as substring
public class repeatedString{
        public int repeatedStringMatch(String a, String b) {
            StringBuilder repeatedA = new StringBuilder(a);
            int count=1;
          while(repeatedA.length()<b.length()){
            repeatedA.append(a);
            count++;
          }
          if(repeatedA.toString().contains(b)){
            return count;
          }
          repeatedA.append(a);
          if(repeatedA.toString().contains(b)){
            return count+1;
          }
          return -1;
        }
    }