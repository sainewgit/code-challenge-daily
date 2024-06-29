package Slidingwindowtwopointer;

public class NonRePeatedLongestSub {
    public static void main(String[] args) {
        String s = "abcd";
        // bruteForce(s);
        subString(s);
    }

    private static void subString(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }

    private static void bruteForce(String s) {
        int maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

            }
        }
    }
}
