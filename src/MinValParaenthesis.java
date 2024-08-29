public class MinValParaenthesis {
    public static void main(String[] args) {
        String s = "(((";int i = 0;
        while(i<s.length()){
            if(s.contains("()")){
                s=s.replace("()","");
            }i++;
        }
        System.out.println(s.length());
    }
}
