public class Reverse_vowels {

    public static boolean check(char c1){
        if((c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u')){
            return true;
        }
        return false;
    }
    public static String modify(String s){
        int length = s.length();
        int start = 0;
        int end = length-1;
        StringBuilder sb = new StringBuilder(s);
        while(start<end){
            if(check(s.charAt(start)) && check(s.charAt(end))){
                char temp = s.charAt(start);
                sb.setCharAt(start,s.charAt(end));
                sb.setCharAt(end,temp);
                start++;
                end--;
            } else if (check(s.charAt(start)) && !check(s.charAt(end)) ) {
                end--;

            }
            else if(!check(s.charAt(start)) && check(s.charAt(end))){
                start++;
            }
            else{
                start++;
                end--;
            }

        }
        String result = sb.toString();
        return result;

    }
    public static void main(String[] args) {
        String sc = "practice";
        String m = modify(sc);
        System.out.println(m);
    }
}
