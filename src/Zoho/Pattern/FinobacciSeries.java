package Zoho.Pattern;

public class FinobacciSeries {
    public static int FinPat(int i){
        if(i==1 || i==0){
            return i;
        }
        return FinPat(i-1)+FinPat(i-2);
    }
    public static void main(String[] args) {
        int count = 1;
        int n = 6;
        System.out.println(0);
        while (count<=n){
            System.out.println(FinPat(count++));
        }
    }
}
