public class DecodeString {
    public static void main(String[] args) {
        StringBuilder m1 = new StringBuilder();
        String m = "3[b2[ca]]";
        for(int i = m.length()-1;i>=0;i--){
            if(Character.isLetter(m.charAt(i))){
                m1.append(m.charAt(i));
            } else if (Character.isDigit(m.charAt(i))) {
                int c = m.charAt(i)-'a';
                for(int j = 0;j<c;j++){
                    m1.append(m1);
                }

            }
        }
        m1.reverse();
        System.out.println(m1);
    }
}
