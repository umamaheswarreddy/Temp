package MustDo75;

/**
 * 30th problem
 * using two pointers technique
 */
public class BestTimeToBuyAndSell {

    private static int maxProfit(int[] prices) {

        int left = 0;   // left =buy
        int right = 1;  // right =sell
        int max = 0;
        while (right < prices.length) {

            if (prices[left] > prices[right]) {
                left = right;
            } else if (prices[left] < prices[right]) {
                max = Math.max(max, prices[right] - prices[left]);
            }
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("maxProfit:" + maxProfit);
    }
}
