import java.util.*;
public class MinCostStringTransform {
    public static int mincost(String a ,String b){
        HashMap<Character,Integer> hmap =new HashMap<>();
  
        int count =0;
        for(int i=0;i<b.length();i++){  
            hmap.put(b.charAt(i),hmap.getOrDefault(b.charAt(i),0)+1);         
        }
        //decrease from hashmap

        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if (hmap.containsKey(ch) && hmap.get(ch) > 0) {
             hmap.put(ch, hmap.get(ch)-1);
          }
        }
        //sum up the left counts of extra chars 
        for(int val : hmap.values()){
            count +=val;
        }

        return count;
    }
    public static void main(String[] args){
        String a ="abc";
        String b = "aabbcdc";
        System.out.println(mincost(a, b));
    }
}