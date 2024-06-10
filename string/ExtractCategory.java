package string;

public class ExtractCategory {
    public static void main(String[] args) {
        String str = "we have a large inventory of things in our wahrehouse falling in the category:apperal and slightly more in demand category:makeup along with category:furntuire and";
        extractCategory(str);
    }
    private static void extractCategory(String str) {
        int i = 0;
        while (i >= 0) {
            int start = str.indexOf("category:", i);
            if (start == -1) break;
            int end = str.indexOf(" ", start + 9);
            System.out.println(str.substring(start, end + 1));
            i = end;
        }
    }
}
