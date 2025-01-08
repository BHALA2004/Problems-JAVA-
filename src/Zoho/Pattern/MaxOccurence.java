package Zoho.Pattern;

import java.util.Arrays;

public class MaxOccurence {
    public static void main(String[] args) {
        String s = "abcd";
        int[] arr = new int[26];
        for(int i = 0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(arr));
        int max = 1;char c = ' ';
        for(int i = 0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                c=(char) (i+'a');
            } else if (max==1 && arr[i]!=0) {
                c=(char) (i+'a');
            }
        }
        System.out.println(c+" "+max);

    }
}
