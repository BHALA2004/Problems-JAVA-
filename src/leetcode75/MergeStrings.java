package leetcode75;

public class MergeStrings {
    public static void main(String[] args) {
        String result = "";
        String word1 = "abc", word2 = "pqrks";
        int i = 0,j=0;
        while(i<word1.length() && j<word2.length()){
            result+=word1.charAt(i);result+=word2.charAt(j);
            i++;j++;
        }
        while (i<word1.length()){
            result+=word1.charAt(i);i++;
        }
        while (j<word2.length()){
            result+=word2.charAt(j);j++;
        }
        System.out.println(result);
    }
}
