public class CrossPattern {
    public static void main(String[] args) {
        int s=0;
        int m=1;
        for(int i=1;i<=4;i++){
            s=m;
            for(int j=i;j<=4 ;j++){
                System.out.print(m+" ");
                m=m+j;
            }
            m=s+i+1;
            System.out.println();



        }
    }
}
