public class BuyAndSellStocks {

    /**
     * Calculates max profit by buying and selling stocks
     *
     * It calculates the min value till the pointer(i) , then calculates the profit for that i
     * If the profit is larger , then it'll update the maximum
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int max_profit = 0;
        for(int i=0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            profit = prices[i]-min;
            max_profit= Math.max(profit,max_profit);
        }
        return max_profit;

    }
}
