package Zoho.Pattern;

public class FibonnaciPattern {
    public static int FinPat(int i){
        if(i==1 || i==0){
            return i;
        }
        return FinPat(i-1)+FinPat(i-2);
    }
    public static void main(String[] args) {
        int n = 4;
        int first = 0;
        int second = 1 ;int count = 1;
        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(FinPat(count++)+" ");
            }
            System.out.println();
        }
    }
}
