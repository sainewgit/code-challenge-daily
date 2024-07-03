package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequency {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        List<Integer> ds = new ArrayList<>();
        //printSubsequences(arr, 0, current);  // Start with an empty list and at index 0
        int sum = 0;
        sumPrint(0, arr, ds, 2, sum);
    }

    private static void sumPrint(int index, int[] arr, List<Integer> ds, int target, int sum) {

        if (index >= arr.length) {
            if (target == sum) System.out.println(ds);
            return;
        }
        ds.add(arr[index]);
        sum += arr[index];
        sumPrint(index + 1, arr, ds, target, sum);
        ds.remove(ds.size() - 1);
        sum -= arr[index];
        sumPrint(index + 1, arr, ds, target, sum);
    }

    private static void printSubsequences(int index, int[] arr, List<Integer> ds) {
        //base Condition
        if (index >= arr.length) {
            System.out.print(ds);
            return;
        }
        ds.add(arr[index]);
        printSubsequences(index + 1, arr, ds);
        ds.remove(ds.size() - 1);
        printSubsequences(index + 1, arr, ds);
    }
}
