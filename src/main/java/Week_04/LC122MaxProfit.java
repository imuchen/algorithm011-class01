package Week_04;

/**
 * Created by tianguoxing on 2020/7/19 22:56.
 */
public class LC122MaxProfit {
    /**
     * 贪心算法：只要后一天的价格大于当天的价格，就在当天购入，第二天卖出
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}
