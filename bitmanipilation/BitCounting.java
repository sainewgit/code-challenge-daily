package bitmanipilation;

public class BitCounting {
    public static void main(String[] args) {
     int number=128;
     System.out.print(hammingWeight(number));
    }

    public static int hammingWeight(int n) {
        int count=0;
        while (n!=0)
        {
            count=count+(n&1);
            n>>=1;
        }
        return count;
    }
}
