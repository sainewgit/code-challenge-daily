package string;

public class Basics {
    public static void main(String[] args) {
        String str = "abcd";
       // reverseString(str);
       // System.out.println(palindremo(str));
        //reverseWords();
        //reverseStringTwoPointers(str);
        //rotateLogic();
        subStringPattern(str);
    }

    private static void subStringPattern(String str) {
        int n=str.length();
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                //System.out.println("[");
                for(int k=i;k<=j;k++)
                {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }

    }

    private static void rotateLogic() {
        String str="GeeksforGeeks";

        //leftrotate by 2
        int rotate=2;
          leftRotate(str,rotate);
    }

    private static void leftRotate(String str, int rotate) {
        String temp = str.substring(rotate, str.length());
        System.out.println(temp+str.substring(0,rotate));
    }

    private static void reverseStringTwoPointers(String str) {
        char[] strCh = str.toCharArray();
        int i=0;
        int j=strCh.length-1;
        while (i<=j)
        {
            char temp=strCh[i];
            strCh[i]=strCh[j];
            strCh[j]=temp;
            i++;j--;
        }
        System.out.println(strCh);
    }

    private static void reverseWords() {
       // String s = "i like this program very much ";
        //String s = "  hello world  ";
        String s = "a good   example";

        String[] res = s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for (int i=res.length-1;i>=0;i--)
        {
            sb.append(res[i]);
            if (i>0)
            {
                sb.append(" ");
            }
        }
            System.out.println(sb.toString());
    }

    private static boolean palindremo(String str) {
        String input = str.toLowerCase();
        int i = 0, j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    private static void reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }





}