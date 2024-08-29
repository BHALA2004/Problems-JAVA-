import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class distinct {

    public static int[] sort(int[] g){

        for(int i = 1;i<g.length;i++){
            int temp=g[i];
            int j=i-1;
            while (j>=0 && temp<g[j]){
                g[j+1]=g[j];
                j--;
            }
            g[j+1]=temp;
        }
        return g;

    }

    public static int[] common_digits(int[] nums)
    {
        // code here
        int[] g = {};
        ArrayList<Integer> mo = new ArrayList<>();
        String g1 ="";

        for(int i=0;i<nums.length;i++){
            g1+=nums[i];
        }

        ArrayList<Character> g2 = new ArrayList<>();

        for(int i = 0;i<g1.length();i++){
            Character c = g1.charAt(i);
            if(!g2.contains(c)){
                g2.add(c);
            }
        }
        int[] n = new int[g2.size()];
        for(int i = 0 ;i<n.length;i++){
            n[i]=Integer.valueOf(g2.get(i)-48);
        }



        Arrays.sort(n);
        return n;


    }
    public static void main(String[] args) {
        int[] g  = {131 ,2, 11, 455};
        int[] m = common_digits(g);
        for(int i : m){
            System.out.println(i);
        }

    }
}
