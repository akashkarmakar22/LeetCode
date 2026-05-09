class Solution {
    public int maxProfit(int[] prices) {
        int MaxPrice = 0;
        for(int i = 1; i< prices.length;++i){
            int DailyProfit = prices[i] - prices[i-1];
            MaxPrice = MaxPrice + Math.max(0,DailyProfit);
        }
        return MaxPrice;
        
    }
}