package Zoho.Pattern;

public class ReturnIndex {
    static int row = 0;

    public static boolean check(String s, int index, String s1) {
        int j = s1.length() - 1;
        while (index < s.length() && j >= 0 && s.charAt(index) != ' ' && s.charAt(index) == s1.charAt(j)) {
            index++;
            j--;
        }
        return j == -1;
    }

    public static int nextIndex(String s, int index) {
        row++;
        for (int i = index; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                return i;
            }
        }
        return s.length();
    }

    public static void main(String[] args) {
        String s = "jnalkjnkekjfnaeijqllkdnlv", s1 = "yessam";boolean res = false;
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s1.charAt(s1.length() - 1)) {
                boolean check = check(s, i, s1);
                if (check) {
                    System.out.print("Indexes = "+(row+1) + " ");
                    res = true;
                }
                else {
                    res=res||check;
                }
            }
            n = nextIndex(s, i);
            i=n;
        }
        if(!res){
            System.out.println(-1);
        }
    }
}
