package Zoho.Pattern;

public class SpiralMatr {
    public static void main(String[] args) {
        int n = 5;int next = 5/2;
        for(int i =1 ;i<=next+1;i++){
            for (int j = 1;j<i;j++){
                System.out.print(" ");
            }
            for(int j = n-i+1;j>=i;j--){
                if(i==n-j){
                    System.out.print((j+1)+" ");
                } else if (i==j) {
                    System.out.print(j+" ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
