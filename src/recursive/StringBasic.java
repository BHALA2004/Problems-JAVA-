package recursive;

public class StringBasic {
    public static void main(String[] args) {
        String s = "baabac";String res="";
        removeStr(s,0,res);
        System.out.println(removeStrOneArguement(s,0));
        System.out.println(SkipApple("bbbapple"));
        System.out.println(SkipApp("bbbapplke"));

    }
    public static void removeStr(String s ,int i,String res){
        if(i==s.length()){
            System.out.println(res);
            return;
        }
        char g = s.charAt(i);
        if(g!='a'){
            removeStr(s,i+1,res+g);
        }
        else {
            removeStr(s,i+1,res);
        }
    }

    public static String removeStrOneArguement(String s ,int i){
        if(i==s.length()){
            return "";
        }
        char g = s.charAt(i);
        if(g!='a'){
            return g+removeStrOneArguement(s,i+1);
        }
        else {
            return removeStrOneArguement(s,i+1);
        }
    }

    public static String SkipApple(String s){
        if(s.isEmpty()){
            return "";
        }

        if(s.startsWith("apple")){
            return SkipApple(s.substring(5));
        }
        else {
            return  s.charAt(0)+SkipApple(s.substring(1));
        }
    }

    public static String SkipApp(String s){
        if(s.isEmpty()){
            return "";
        }

        if(s.startsWith("app") && !s.startsWith("apple")){
            return SkipApp(s.substring(3));
        }
        else {
            return  s.charAt(0)+SkipApp(s.substring(1));
        }
    }
}
