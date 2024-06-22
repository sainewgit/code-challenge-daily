package arrays.twopointer;



public class RotateArrayChallenge {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
       // rotateLeft(nums, k);
        rotateRight(nums,k);
    }

    private static void rotateLeft(int[] nums, int k) {
        //revere first k(k-1) element
        reverse(nums, 0, k - 1);
        //reverse reaming k to end ,
        reverse(nums, k-1, nums.length - 1);
        //revrse start to end
        reverse(nums, 0, nums.length - 1);

    }

    //Pattern TwoPointer
    public static void rotateRight(int[] nums, int k) {



        // Reverse the first 'n-k' elements
        reverse(nums,0,nums.length-k-1);

        //reverse last 2(k)  // Reverse the last 'k' elements
        reverse(nums,nums.length-k,nums.length-1);
        // Reverse the whole array
        reverse(nums,0,nums.length-1);
        for (int h:nums)
        {
            System.out.println(h);
        }
    }


    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
