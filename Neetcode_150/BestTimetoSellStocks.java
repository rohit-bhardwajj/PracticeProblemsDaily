class Solution {
    public int maxProfit(int[] prices) {
        int costP = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<costP){
                costP = prices[i];//potentially lower cp(cheaper)
            }
            else{
                profit = Math.max(profit,(prices[i]-costP));//(potentially > sp)
            }
        }
        return profit;
    }
}