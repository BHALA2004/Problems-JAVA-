package Zoho.Pattern;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;i<=n;i++){
            int c = i;
            for(int j = 1;j<=n;j++){
                System.out.print(i + " ");
                i+=n;
            }
            i=c;
            System.out.println();
        }
    }
}
