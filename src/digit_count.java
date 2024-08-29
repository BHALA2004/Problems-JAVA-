public class digit_count {
    public static int counts(String str1 , int index){
        char[] c = str1.toCharArray();
        char g = (char) (index + '0'); // Convert index to char digit
        int flag = 0;
        for(int i = 0; i < c.length; i++){
            if(g == c[i]){
                flag++;
            }
        }
        return flag;
    }

    public static boolean digi(String str){
        String temp = str;
        String s = "";
        for(int i = 0; i < str.length(); i++){
            int from = counts(str, i); // Pass index i to counts method
            s += from;
        }
        return s.equals(temp);
    }

    public static void main(String[] args) {
        String s1 = "030";
        boolean result = digi(s1);
        System.out.println(result);
    }
}