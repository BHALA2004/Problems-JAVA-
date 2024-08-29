import java.util.ArrayList;
import java.util.List;

public class gcd {
    public static void gcd(int a, int b) {
        // code here

//        List<Integer> val = new ArrayList<Integer>();
//        val.add(0,45);
//        val.add(4);
//        System.out.println(val);

        if(b==0)
            System.out.println(a);
        else
            gcd(b,a%b);



    }

    public static void main(String[] args) {
        gcd(6,3);
        //System.out.println(m);
    }
}
