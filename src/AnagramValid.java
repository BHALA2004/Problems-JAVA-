public class AnagramValid {
    public static void main(String[] args) {
        String s = "silent";
        String s1 = "litsenty";
        int[] m = new int[26];
        for(int i = 0;i<s.length();i++){
            m[s.charAt(i)-'a']++;
        }
        for(int i = 0;i<s1.length();i++){
            m[s1.charAt(i)-'a']--;
        }
        boolean m1 = true;
        for(int i: m){
            if(i!=0){
                m1 =false;
            }
        }
        System.out.println(m1);
    }
}
