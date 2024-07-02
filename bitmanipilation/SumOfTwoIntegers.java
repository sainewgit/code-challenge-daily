package bitmanipilation;

//Given two integers a and b, return the sum of the two integers without using the operators + and -.
public class SumOfTwoIntegers {
    public static void main(String[] args) {
        int a = 11, b = 12;
        System.out.print(getSum(a, b));
    }

    public static int getSum(int a, int b) {

        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }

}
