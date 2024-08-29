import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class compute {

    public static String isSubset( long a1[], long a2[], long n, long m) {
        boolean re = true;
        List<Long> x = new ArrayList<>();
        List <Long> x1 = new ArrayList<>();
        if(n>m){

            for(int i=0;i<a1.length;i++){
                x.add(a1[i]);
            }
            for(int j=0;j< a2.length;j++){
                x1.add(a2[j]);
            }



            for(int i =0 ;i<a2.length;i++){

                if(x.contains(a2[i])){

                    x1.remove(a2[i]);
                }

            }








        }
        /*else{

            List<Long> x = new ArrayList<>();
            List <Long> x1 = new ArrayList<>();
            for(int i=0;i<a1.length;i++){
                x.add(a1[i]);
            }
            for(int j=0;j< a2.length;j++){
                x1.add(a2[j]);
            }
            for(int i =0 ;i<x.size();i++){
                if(!(x1.contains( Long.valueOf(x.get(i))))){
                    re=false;break;}

            }

        }
*/
        return x1.isEmpty()?"Yes":"No";


    }
    public static void main(String[] args) {
        long[] g= {1, 2, 3, 4,5,6,7,8};
        long[] g1={1,2,3,1};
        String  s = isSubset(g,g1,g.length,g1.length);
        System.out.println(s);
    }
}
