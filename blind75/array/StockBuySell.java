package blind75.array;

public class StockBuySell {
    public static void main(String[] args) {
       // int[] prices= {7,1,5,3,6,4};
        int[] prices= {2,1,2,1,0,1,2};
       System.out.println( maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        for (int i=1;i<prices.length;i++)
        {
            int profit=prices[i]-min;
            max=Math.max(max,profit);
            min=Math.min(min,prices[i]);
        }
        return max;
    }
}
