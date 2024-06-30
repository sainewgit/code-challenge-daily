package blind75.array;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arry = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
      //  int result = maxSubArrayBrute(arry);
       // int result = maxSubArray(arry);
         printMaxSubArray(arry);
        //System.out.println(result);

    }

    private static void printMaxSubArray(int[] arry) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int begin = -1;
        int end = -1;
        for (int i = 0; i < arry.length; i++) {
            if (sum == 0) start = i;
            sum = sum + arry[i];
            if (sum > max) {
                max = sum;
                begin = start;
                end = i;
            }
            if (sum < 0) sum = 0;
        }
        System.out.print("[");
       for (int i=begin;i<=end;i++)
       {
           System.out.print(arry[i]+",");
       }
        System.out.print("]");
    }

    public static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if (sum>max){ max=sum;}
            if (sum<0) {sum=0;}
        }
      return max;
    }

    public static int maxSubArrayBrute(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + nums[k];
                }
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
