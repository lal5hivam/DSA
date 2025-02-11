class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int prev = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            int currprice = prices[i];
            if(currprice < prev){
                profit += prev - buy;
                buy = currprice;
                prev = currprice;
            }
            prev = currprice;
        }
        return profit + prev - buy;
    }
}