package Zoho.Pattern;

public class rowIncrementReversePattern {
    public static void main(String[] args) {
        int n = 4;int temp = 1;
        for(int i = 1;i<=n;i++){
            int num = temp;
            int counter = i+1;
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp--;
            }
            num+=counter;
            temp=num;
            System.out.println();
        }
    }
}
