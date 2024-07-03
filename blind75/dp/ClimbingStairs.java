package blind75.dp;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n= 3;
        System.out.print(climbStairs(n));
    }

    private static  int climbStairs(int n) {
        int prev2=1;
        int prev=1;
        for (int i=2;i<=n;i++)
        {
            int curr=prev+prev2;
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}
