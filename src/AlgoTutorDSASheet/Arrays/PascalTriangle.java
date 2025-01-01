package AlgoTutorDSASheet.Arrays;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1;i<=n;i++){
            for(int j = n-i;j>0;j--){
                System.out.print(" ");
            }
            int val = 1;
            for(int j = 1;j<=i;j++){
                System.out.print(val+" ");
                val = (val * (i - j)) / j;
            }
            System.out.println();
        }
    }

}
