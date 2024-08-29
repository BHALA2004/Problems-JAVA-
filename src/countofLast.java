public class countofLast {
    public static int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        String g = s1[s1.length-1];
        return g.length();

    }
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        int result = lengthOfLastWord(s);
        System.out.println(result);


    }
}
