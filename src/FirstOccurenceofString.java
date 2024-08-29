public class FirstOccurenceofString {
    public static int strStr(String haystack, String needle) {
        int n = needle.length();int result = -1;
        for(int i=0;i<=haystack.length()-n;i++){
            String s = haystack.substring(i,n+i);
            if(s.equals(needle)){
                result=i;break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String first = "leetcode";
        String second = "leeto";
        int result = strStr(first,second);

        System.out.println(result);
    }
}
