package Zoho.Pattern;

public class StringCompression {
    public static void main(String[] args) {
       char[] chars = {'a','a','b','b','c','c','i','c','z','z','j','j','i'};
       int[] arr = new int[26];
       for(int i = 0;i<chars.length;i++){
           arr[chars[i]-'a']++;
       }
       for(int i = 0;i<arr.length;i++){
           if(arr[i]!=0){
           System.out.print((char)(i+'a')+"-"+arr[i]+" ");}
       }
    }
}
