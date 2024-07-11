package blind75.dp;


import java.util.Arrays;

public class CoinChange {

    public static int coinChange1(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] dp = new int[amount + 1];
        java.util.Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println("Minimum coins needed: " + coinChange(coins, amount)); // Output: 3

//        int[] coins2 = {2};
//        int amount2 = 3;
//        System.out.println("Minimum coins needed: " + coinChange(coins2, amount2)); // Output: -1
    }
    public static int coinChange(int[] coins, int amount) {
         if (amount==0) return 0;
         int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for (int i=1;i<=amount;i++)
        {
            for ( int coin: coins)
            {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }

}
