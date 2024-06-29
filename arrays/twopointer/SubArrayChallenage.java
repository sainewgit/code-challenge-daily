package arrays.twopointer;

public class SubArrayChallenage {

    public static void main(String[] args) {
        int[] array = {10, 5, 2, 7, 1, 9};
        int n = array.length;
        int k = 15;
       // lenOfLongSubarrSum(array, n, k);
        subArray();
    }

    private static void subArray() {

        int[] arr = {1, 2, 3};
        int n = arr.length;
        for (int i=0; i <n; i++)
        {
            // Pick ending point
            for (int j=i; j<n; j++)
            {
                // Print subarray between current starting
                // and ending points
                for (int k=i; k<=j; k++)
                {
                    System.out.print(arr[k]+" ");
                }

                System.out.println();
            }

            }
        }

    // 2 pointer approach
    public static int lenOfLongSubarrSum(int[] a, int n, int k) {
        int l = 0;
        int r = 0;
        int sum = a[0];
        int length = 0;
        while (r < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (l <= r && sum > k) {
                sum = sum - a[l];
                l--;
            }
            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                length = Math.max(length, r - l + 1);
            }
            // Move forward thw right pointer:
            r++;
            if (r < n) sum = sum + a[r];

        }
        return length;
    }
}
