// Problem 4 LC-1431. Kids With the Greatest Number of Candies
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int mx =Integer.MIN_VALUE; int ext = extraCandies;
        for(int n : candies){
            if(n>mx) mx = n;
        }
        for(int n : candies){
            if((n + ext) >= mx){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}