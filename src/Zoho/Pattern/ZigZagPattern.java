package Zoho.Pattern;

public class ZigZagPattern {
    public static void main(String[] args) {
        int n=4;boolean f = true;int count = 1;
        for(int i = 1;i<=n;i++){
            if(f){
                count=n*(i-1);
            for(int j = 1;j<=n;j++){
                System.out.print(++count + " ");
            }
                f=false;
            }
            else {
                count=n*i;
                for(int j = 1;j<=n;j++){
                     System.out.print(count-- + " ");
                }
                f=true;
            }
            System.out.println();
        }
    }
}
