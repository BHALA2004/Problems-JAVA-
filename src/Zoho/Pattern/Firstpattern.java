package Zoho.Pattern;

public class Firstpattern {
    public static void main(String[] args) {

        int n = 5;int value = 0;
        for(int i = 1;i<=n;i++){
            value = i;
            for(int j = 1;j<=i;j++){
                System.out.print(value+ " ");
                value+=n-j;
            }
            System.out.println();
        }


    }
}
