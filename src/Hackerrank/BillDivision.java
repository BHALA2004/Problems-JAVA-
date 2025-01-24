package Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BillDivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int girlAmount  = 0;
        int bouAmount  = 0;
        for (int i = 0; i < bill.size(); i++) {
            if(i!=k){
                girlAmount+=bill.get(i);
            }
            bouAmount+=bill.get(i);
        }
        bouAmount/=2;
        girlAmount/=2;
        if(girlAmount==b){
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(bouAmount-girlAmount);
        }

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 10, 2 ,9));
        int girlIndex  = 1;
        int girlamount = 12;
        bonAppetit(list,girlIndex,girlamount);
    }
}
