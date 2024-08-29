public class right_rotate {
    public static int[] rotating(int[] g, int n,int r){

        for(int j=0;j<r;j++){
        int temp = g[0];
        for(int i =0;i<g.length-1;i++){
            g[i]=g[i+1];
        }
        g[n-1]=temp;}
        return g;


    }
    public static void main(String[] args) {
        int[] a = {7 ,5, 2, 11, 2 ,43, 1, 1};
        int[] g  = rotating(a,a.length,2);
        for(int i:g){
            System.out.println(i);
        }
    }
}
