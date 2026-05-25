// best time to buy and sell stock

// Approach
// 1. While moving through the array:
// 2. Keep track of the minimum price seen so far
// 3. Calculate profit if sold today
// 4. Update maximum profit

public class bttbs {

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {

            // update minimum price
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // calculate profit
            int profit = prices[i] - minPrice;

            // update max profit
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int prices[] = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }
}