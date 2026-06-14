class Solution {
    public int maxProfit(int[] prices) {
        int currentBuyPrice= prices[0];
        int maxProfit= Integer.MIN_VALUE;
        for (int i=1; i<prices.length; i++) {
            maxProfit= Math
                .max(maxProfit, prices[i]- currentBuyPrice);
            currentBuyPrice= Math.min(currentBuyPrice, prices[i]);
        }
        return maxProfit<0? 0: maxProfit;
    }
}
