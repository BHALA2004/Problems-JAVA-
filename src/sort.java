import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sort {

    public static long[] getmaxmin(long a[],long n ){
        long max=a[0];
        for(int i = 1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        long maxi=max;

        long mini=a[0];
        for(int i = 1;i<a.length;i++){
            if(mini>a[i]){
                mini=a[i];
            }
        }long min= mini;

        long m[]={min,maxi};
        return m;
    }
    public static void main(String[] args) {
        long a[] = {3, 2, 1, 56, 10000, 167};
        int g= a.length;
        long[] s = getmaxmin(a,g);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }


    }
}
