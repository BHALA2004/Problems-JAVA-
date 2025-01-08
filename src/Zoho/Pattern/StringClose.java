package Zoho.Pattern;

public class StringClose {
    public static void main(String[] args) {
        String s = "abc",t="bca";
        System.out.println((s+s).indexOf(t));
    }
}
