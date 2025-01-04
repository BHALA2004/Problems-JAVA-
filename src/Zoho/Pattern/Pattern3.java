package Zoho.Pattern;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 4;int value  = 1;int counter = 0;boolean f = true;int temp = 0;
        for(int i = 1;i<=n;i++){
            counter=i+1;
            for(int j=n+1-i;j>=1;j--){
                if(f){
                    temp=value;f=false;
                }
                System.out.print(value+" ");
                value+=counter;
                counter++;
            }
            temp+=i;
            value=temp;
            System.out.println();
        }
    }
}
