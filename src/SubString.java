public class SubString {
    public static int strstr(String s, String x)
    {
        // Your code here
        String m = "";int g = -1;
        int n = x.length();
        for(int i = 0;i<=s.length()-n;i++){
            m=s.substring(i,i+n);
            if(m.equals(x)){
                g=i;break;
            }

        }
        //System.out.println(s.substring(0,3));
        return g;

    }
    public static void main(String[] args) {
        String s = "abcabcabcd", x = "abcd";
        int result = strstr(s,x);
        System.out.println(result);
    }
}
