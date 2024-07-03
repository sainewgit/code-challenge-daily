package blind75.dp;

import java.util.Arrays;

public class DpBasics {
    public static void main(String[] args) {
        int n = 3;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        fibnaicDp(n, dp);
    }

    private static int fibnaicDp(int n, int[] dp) {
        if (n <= 1) return n;
        if (dp[n] != 1) return dp[n];
        return dp[n] = fibnaicDp(n - 1, dp) + fibnaicDp(n - 2, dp);
    }

}
