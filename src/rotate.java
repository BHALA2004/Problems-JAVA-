public class rotate {

    public static int[] rotate(int a[], int n,int t) {

        for(int j=0;j<=t;j++){
            int temp = a[n-1];
        for(int i=n-1;i>=1;i--){
            a[i]=a[i-1];
        }
        a[0]=temp;}
        return a;

    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] g  = rotate(a,a.length,3);
        for(int i:g){
            System.out.println(i);
        }
    }

}