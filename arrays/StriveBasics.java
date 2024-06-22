package arrays;

public class StriveBasics {

    public static void main(String[] args) {
        int result = 0;
        int[] a = {1,1,2};

        // int result = largestElementArray(a);
        //int result = SecondLargestElementArray(a);
        //int result=SecondSmallElementArray(a);
        //int result=isSorted(a.length,a);
        result=removeDuplicates(a,a.length);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int i=0;
        for (int j=1;j<=n-1;j++)
        {
            if (arr[i]!=arr[j])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }
      return i+1;
    }


    public static int isSorted(int n, int []a) {
        // Write your code here.
        for (int i = 1; i <=n - 1; i++) {
            if (a[i] < a[i - 1]) {
                return 0;
            }
        }
        return 1;
    }

    private static int largestElementArray(int[] a) {
        int max = a[0];
        for (int i = 1; i <= a.length - 1; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    private static int SecondLargestElementArray(int[] a) {
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > large) {
                second_large = large;
                large = a[i];
            } else if (a[i] > second_large && a[i] != large) {
                second_large = a[i];
            }
        }
        return second_large;
    }

    private static int SecondSmallElementArray(int[] a) {
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < small) {
                second_small = small;
                small = a[i];
            } else if (a[i] < second_small && a[i] != small) {
                second_small = a[i];
            }
        }
        return second_small;
    }


}
