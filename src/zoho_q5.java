public class zoho_q5 {
    public static boolean isPalindrome(String s) {
        String s1 = "";
        for(int i = 0; i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                s1+=Character.toLowerCase(s.charAt(i));
            }
            else if(!(Character.isLetterOrDigit(s.charAt(i)))){
                continue;
            } else if (Character.isDigit(s.charAt(i))) {
                s1+=Character.toLowerCase(s.charAt(i));

            } else if (Character.isLowerCase(s.charAt(i))) {
                s1+=Character.toLowerCase(s.charAt(i));

            }
        }
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder(s1);
        String g = s2.reverse().toString();
        return s1.equals(g)?true:false;

    }
    public static void main(String[] args) {
        String s = "0P";
        boolean result = isPalindrome(s);
        System.out.println(result);
    }
}
