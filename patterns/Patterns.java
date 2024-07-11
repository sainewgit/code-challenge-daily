package patterns;

public class Patterns {

    public static void main(String[] args) {
        int n = 4;
        //patterStar(n);
        System.out.println(isAramStrong(153));
    }
    private static void patterStar(int n) {
        for (int i = n; i >=0; i--) {  // rows
            for (int j = 0; j <= i; j++) { // coloums
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static boolean isPalindrome(int x) {
        int result=0;
        int dummy=x;
        while(x!=0)
        {
            int tail=(x%10);
            int newResult=(result*10)+tail;
            // Check for overflow/underflow

            result=newResult;
            x=x/10;
        }
        System.out.println(result);
        return dummy == result;
    }

    public static boolean isAramStrong(int number)
    {
        int sum=0;
        int dummy= number;
        while (number>0)
        {
            int ld=number%10;
            sum=sum+(ld*ld*ld);
            number=number/10;
        }
        System.out.println(sum);
        return sum==dummy;
    }


}
