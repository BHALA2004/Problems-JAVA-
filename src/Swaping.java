import java.util.ArrayList;
import java.util.List;

public class Swaping {
    public static void reverse(Integer[] arr,int i,int k){
        int start = i;
        int end = k;
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);s.add(5);
        s.add(6);
        s.add(7);
        s.add(8);

        Integer[] g = s.toArray(new Integer[s.size()]);
        int n=g.length-1;
        int k = 5;
        int i = 0;
        while (i<k && k<=n){

            reverse(g,i,k-1);
            i=k;
            k=i+k;
        }
        if(k>n){
            k=n;
            reverse(g,i,k);
        }
        for(int j : g){
            System.out.print(j+" ");
        }


    }
}
