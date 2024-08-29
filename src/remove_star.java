public class remove_star {
    public static String removestar(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(!(s.charAt(i)=='*')){
                char c = s.charAt(i);
                sb.append(c);
            }
            else{
                sb.deleteCharAt(i);
            }
        }
        String r = sb.toString();
        return r;
    }
    public static void main(String[] args) {
        String m = "leet**cod*e";
        String s = removestar(m);
        System.out.println(s);
    }
}
