import java.util.Map;

public class zoho_q6 {
    public static boolean isPowerOfThree(int n) {
        int i =1;
        boolean g = false;
        while(i<=(n/2)){
            if((Math.pow(3,i))==n){
                g=true;break;
            } else if ((Math.pow(3,i))<n) {
                i++;
            }
            else if((Math.pow(3,i))>n){
                g=false;break;
            }
        }
        return g;
    }
    public static void main(String[] args) {
        boolean g = isPowerOfThree(243);
        System.out.println(g);
    }
}
