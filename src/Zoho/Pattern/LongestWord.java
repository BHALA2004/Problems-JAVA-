package Zoho.Pattern;

public class LongestWord {
    public static void main(String[] args) {
        String str = "Tamizhaga Vetri kazhagam";int count  = 0;int max  = Integer.MIN_VALUE;int index = 0;
        for (int i = 0; i < str.length()+1; i++) {
            if( i==str.length() || str.charAt(i)==' ' ){
                if(max<count){
                    max=count;
                    index=i;
                }
                count=0;
            }
            else {
                count++;
            }
        }
        System.out.println(max);
        System.out.println(index);
        System.out.println();
        System.out.println(str.substring(index-max,index));
    }
}
