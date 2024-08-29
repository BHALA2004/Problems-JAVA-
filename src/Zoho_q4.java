import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoho_q4 {
    public static void sortIt(long arr[], long n)
    {
        //code here.

        List<Long> odd = new ArrayList<>();
        List<Long> even = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }
            else {
                odd.add(arr[i]);
            }
        }
        long[] s = new long[odd.size()];
        for(int i=0;i<s.length;i++){
            s[i]=odd.get(i);
        }
        long[] g = new long[even.size()];
        for(int i=0;i<g.length;i++){
            g[i] = even.get(i);
        }
        Arrays.sort(s);
        Arrays.sort(g);
        int start = 0;
        int end = s.length-1;
        while(start<end){
            long temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;end--;
        }
        int k=0,l=odd.size();
        while(k<odd.size()){
            arr[k]=s[k];k++;
        }
        int o=0;
        while(l<n){
            arr[l]=g[o];l++;o++;
        }
        for(long x : arr){
            System.out.println(x);
        }








    }
    public static void main(String[] args) {
       long[] arr = {1, 2, 3, 5, 4, 7, 10};
       long n = arr.length;
        sortIt(arr,n);
    }
}
