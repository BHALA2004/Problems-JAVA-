package Zoho.Pattern;

public class pascalTriangle {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1;i<=n;i++){
            //Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Printing Element
            int val = 1;
            for(int j=1;j<=i;j++){
                System.out.print(val+" ");
                val = val * (i-j)/j;
            }
            System.out.println();
        }
    }
}
