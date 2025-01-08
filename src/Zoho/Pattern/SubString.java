package Zoho.Pattern;

public class SubString {
    public static void main(String[] args) {
        String s = "1000000000";
        String sub1 = "101";
        String sub2 = "010";
        for(int i = 0;i<s.length()-sub1.length();i++){
            if(sub1.equals(s.substring(i,i+sub1.length())) || sub2.equals(s.substring(i,i+sub1.length()))){
                System.out.println(true);System.exit(1);
            }
        }
        System.out.println(false);
    }
}
