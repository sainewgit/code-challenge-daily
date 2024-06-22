package recursion;

public class RecursionChallenge1 {

    public static void main(String[] args) {
        String str="naresh";
        String response = allDollars(str);
        System.out.println(response);
    }
    private static String allDollars(String str) {
        //basecondition
        if (str.length()<=1) return str;
        return str.charAt(0)+"$"
                +allDollars(str.substring(1));
    }

}
