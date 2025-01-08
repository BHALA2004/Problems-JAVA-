package Zoho.Pattern;

import java.util.ArrayList;
import java.util.List;

public class PrintSimple {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int pos = 0;
        int zero  =0;
        int neg = 0;
        for(int i : arr){
            if(i==0){
                zero++;
            }
            else if(i>0){
                pos++;
            }
            else{
                neg++;
            }
        }
        double posratio = (double) pos/arr.size();
        double negratio = (double) neg/arr.size();
        double zeroratio = (double) zero/arr.size();
        System.out.printf("%.6f",posratio);
        System.out.println();
        System.out.printf("%.6f",negratio);
        System.out.println();
        System.out.printf("%.6f",zeroratio);

    }

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(-4);
        list.add(3);list.add(-9);list.add(0);list.add(4);list.add(1);
        plusMinus(list);
    }
}
