public class patterning {
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("   ");
            }
            for(int j=n;j>(n-i);j--){

                if(m>10){

                    System.out.print(m++);
                    System.out.print(" ");

                }
                else {
                    System.out.print(m++);
                    System.out.print("  ");
                }
            }
            System.out.println("\n");
        }
    }
}
