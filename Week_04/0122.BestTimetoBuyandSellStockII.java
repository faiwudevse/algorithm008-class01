/*
time complexity: O(n)
space complexity: O(1)
thought process: use Greedy algorithm as long as the previous prices is less than the current we calcualte the profit
*/
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }
}