package Zoho.Pattern;

public class FloatPrint {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(i+"."+j+" ");
            }
            System.out.println();
        }
    }
}
