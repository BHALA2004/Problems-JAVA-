package Zoho.Pattern;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 3;int count = 1;
        for(int i = 1;i<=n;i++){
            //Spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }
            //Element Printing
           for(int j = 1;j<=count;j++){
               System.out.print(" "+j);
           }

            for(int j = count-1; j >= 1; j--) {
                System.out.print( " " +j);
            }
           count+=1;
            System.out.println();
        }
    }
}
