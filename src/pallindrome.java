public class pallindrome {
    public static String is_palindrome(int n)
    {
        String o = "No";
        String r = Integer.toString(n);
        String s = Integer.toString(n);
        StringBuilder g = new StringBuilder(r);
        StringBuilder m = new StringBuilder(s);
        String e  =  m.reverse().toString();
        if(e.equals(r))
            o="Yes";
        return o;

    }
    public static void main(String[] args) {
        String s = is_palindrome(123);
        System.out.println(s);
    }
}
