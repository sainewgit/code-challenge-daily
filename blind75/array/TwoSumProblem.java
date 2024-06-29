package blind75.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    //1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
//2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
       // twoSum(nums, target);
        System.out.println(twoSumTwoPointer(nums, target));
    }



    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> twoSum = new HashMap<>();
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if (twoSum.containsKey(remain)) {
                ans[0] = twoSum.get(remain);
                ans[1] = i;
                return ans;
            }
            twoSum.put(nums[i], i);
        }
        return ans;
    }

    private static boolean twoSumTwoPointer(int[] nums, int target) {
       int left=0;
       int right=nums.length-1;
       while (left<right)
       {
           int sum = left + right;
           if (sum==target) return true;
           else if (sum<target) left++;
           else right--;
       }
        return false;
    }

}
