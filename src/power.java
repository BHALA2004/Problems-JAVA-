public class power {
    public static int powering(int n,int n1){
        if(n1==1){
            return n;
        }
        else{
            return n*powering(n,n1-1);
        }
    }
    public static void main(String[] args) {
        int g = powering(12,21);
        System.out.println(g);
    }
}
