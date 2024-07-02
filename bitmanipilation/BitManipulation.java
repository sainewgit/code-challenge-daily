package bitmanipilation;

public class BitManipulation {
    public static void main(String[] args) {
        int number=156;
        String binary = convertBinary(number);
        convertDecimal(binary);

    }

    private static void convertDecimal(String binary) {
        int decimal=0;
        for (int i=0;i<binary.length();i++)
        {
            decimal=decimal*2+(binary.charAt(i)-'0');
        }
        System.out.print(decimal);
    }

    private static String convertBinary(int n) {
        String binary = "";
        while (n > 0) {
            int bit = n % 2;
            binary = bit + binary;
            n = n / 2;
        }
        return binary;
    }
}
