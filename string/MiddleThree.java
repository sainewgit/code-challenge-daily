package string;

public class MiddleThree {

    public static void main(String[] args) {
       String input="Jamaica";
       String output = middleThree(input);
       System.out.println(output);
    }



    /**
     Given a string of odd length, return the middle 3 characters from the string,
     so the string <b>"Monitor"</b> yields <b>"nit"</b>.
     If the string length is less than 3, return the string as is. <br> <br>

     <b>EXPECTATIONS:</b><br>
     middleThree("bunny") <b>---></b> "unn" <br>
     middleThree("peter") <b>---></b> "ete" <br>
     middleThree("Jamaica") <b>---></b>"mai" <br>
     */
    private static String middleThree(String input) {
        int length = input.length();
        if (length<3) return input;
        int middleLength=length/2;
        return input.substring(middleLength-1,middleLength+2);
    }



}
