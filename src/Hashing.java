import java.util.ArrayList;
import java.util.List;

public class Hashing {
    public static void main(String[] args) {
        int[] n = {1,2,3,2,1};
        int[] hash = new int[13];
        for(int i=0;i<n.length;i++){
            hash[n[i]]+=1;
        }
        int sum = 0 ,num = 0;
        String str="a1b40c5";
        for(int i = 0 ;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                num=0;
            } else if (Character.isDigit(str.charAt(i))) {
                String g =Character.toString(str.charAt(i));
                int x  = Integer.parseInt(g);
                num=(num*10)+x;
                sum+=num;

            }
        }
        System.out.println(sum);
//        for(int i = 1 ; i<hash.length;i++){
//            if(hash[i]!=0){
//            System.out.println(hash[i]);}
//        }

    }
}
