class Solution {
    public int maxProfit(int[] prices) {
        int MaxProfit = 0;
        int MinPrices = prices[0];

        for(int CurrentDayProfit : prices){
            MaxProfit = Math.max(MaxProfit,CurrentDayProfit - MinPrices);
            MinPrices = Math.min(MinPrices, CurrentDayProfit);
        }
        return MaxProfit;
        
    }
}