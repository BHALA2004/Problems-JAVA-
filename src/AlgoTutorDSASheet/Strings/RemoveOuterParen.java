package AlgoTutorDSASheet.Strings;

public class RemoveOuterParen {
    public static String removeOuterParentheses(String s) {
        int count = 0;String n = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                if(count!=1){
                    n+=s.charAt(i);
                }

            } else if (s.charAt(i)==')') {
                count--;
                if(count!=0){
                    n+=s.charAt(i);
                }

            }
        }
        return n;
    }    public static void main(String[] args) {
       String s =  "()()";
       String out = "";
       String res = removeOuterParentheses(s);
       System.out.println(out);
    }
}
