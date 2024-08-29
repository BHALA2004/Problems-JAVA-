public class summing {
    public static void main(String[] args) {
        int n = 3;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=n-i;k>0;k--){
                System.out.print("* ");
            }
            System.out.println();
        }



        //String s = new String("bala");
        //System.out.println(s);
    }
}
